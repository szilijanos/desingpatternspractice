package org.example.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonPartTest {
    @Test
    public void testCanCreateCommonPartInstance() {
        final CommonPart commonPartInstance = new CommonPart(1, "hey");

        Assertions.assertNotNull(commonPartInstance);
    }
}
