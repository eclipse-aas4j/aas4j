package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.visitor;

import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Environment;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssetAdministrationShellElementWalkerVisitorTest {

    Environment env = AASFull.createEnvironment();

    @Test
    public void visit() {
        TestVisitor testVisitor = new TestVisitor();
        testVisitor.visit(env);
        assertNotNull(env);
    }

    private class TestVisitor implements AssetAdministrationShellElementWalkerVisitor{

    }
}