package org.example.privateClassData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testCreation() {
        MainDataClass o = new MainDataClass(1, 2, 3, 4);
        Assertions.assertNotNull(o);
    }

    @Test
    public void testDataAccess() {
        MainDataClass o = new MainDataClass(1, 2, 3, 4);
        Assertions.assertEquals(1, o.getI1());
        Assertions.assertEquals(2, o.getI2());
        Assertions.assertEquals(3, o.getI3());
        Assertions.assertEquals(4, o.getI4());
        o.setI4(5);
        Assertions.assertEquals(5, o.getI4());
    }
}
