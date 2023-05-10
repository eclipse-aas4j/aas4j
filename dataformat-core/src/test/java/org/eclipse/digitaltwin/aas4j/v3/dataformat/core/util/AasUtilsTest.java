package org.eclipse.digitaltwin.aas4j.v3.dataformat.core.util;

import junit.framework.TestCase;
import org.eclipse.digitaltwin.aas4j.v3.dataformat.core.AASFull;
import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultSubmodel;
import org.junit.Test;

import static org.junit.Assert.*;

public class AasUtilsTest {

    @Test
    public void resolve() {
        assertNotNull(AasUtils.resolve(AASFull.AAS_1.getSubmodels().get(0), AASFull.createEnvironment()));

        Submodel asSubmodel = AasUtils.resolve(
                AASFull.AAS_1.getSubmodels().get(0),
                AASFull.createEnvironment(),
                Submodel.class
        );
        assertNotNull(asSubmodel);
        assertEquals(DefaultSubmodel.class, asSubmodel.getClass());

    }

    @Test
    public void getAasProperties() {
        assertTrue(AasUtils.getAasProperties(DefaultSubmodel.class).size() > 0);
    }
}