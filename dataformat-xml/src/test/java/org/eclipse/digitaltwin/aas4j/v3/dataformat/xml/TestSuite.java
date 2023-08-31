package org.eclipse.digitaltwin.aas4j.v3.dataformat.xml;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                XmlValidationTest.class,
                XMLDeserializerTest.class,
                XmlSerializerTest.class,
        }
)
public class TestSuite {
}
