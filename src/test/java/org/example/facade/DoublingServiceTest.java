package org.example.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublingServiceTest {
    @Test
    public void testDoubleThis() {
        CanDoubleAnInteger sut = new DoublingService();
        final int actual = sut.doubleThis(5);
        Assertions.assertEquals(actual, 10);
    }
}
