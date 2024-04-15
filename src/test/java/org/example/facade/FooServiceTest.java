package org.example.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooServiceTest {
    @Test
    public void testDoubleThis() {
        CanPrintAStringANumberOfTimes sut = new FooService();
        final String actual = sut.printStringANumberOfTimes(3, "As");
        Assertions.assertEquals(actual, "AsAsAs");
    }

    @Test
    public void testThrowingIfCountIsNegative() {
        CanPrintAStringANumberOfTimes sut = new FooService();
        final Exception e = Assertions.assertThrowsExactly(
                IllegalArgumentException.class,
                () -> sut.printStringANumberOfTimes(-3, "Any")
        );
        Assertions.assertEquals("count is negative: -3", e.getMessage());
    }
}
