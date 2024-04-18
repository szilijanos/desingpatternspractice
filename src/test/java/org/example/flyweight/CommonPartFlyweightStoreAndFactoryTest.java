package org.example.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonPartFlyweightStoreAndFactoryTest {
    @Test
    public void testFactoryCanCreateCommonPart() {
        final CommonPart cp = CommonPartFlyweightStoreAndFactory.getCommonPart(11, "hello");

        Assertions.assertNotNull(cp);
    }

    @Test
    public void testFactoryReturnsCommonPartRequestedWithIdenticalParametersFromCache() {
        CommonPart cp1 = CommonPartFlyweightStoreAndFactory.getCommonPart(11, "hello");
        CommonPart cp2 = CommonPartFlyweightStoreAndFactory.getCommonPart(11, "hello");

        Assertions.assertSame(cp1, cp2);
    }
}
