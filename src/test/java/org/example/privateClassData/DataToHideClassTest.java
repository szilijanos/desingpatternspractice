package org.example.privateClassData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataToHideClassTest {
    @Test
    public void testCreation() {
        DataToHideClass o = new DataToHideClass(1,2,3);
        Assertions.assertNotNull(o);
    }
}
