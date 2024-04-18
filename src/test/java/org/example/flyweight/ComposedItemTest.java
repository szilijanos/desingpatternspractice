package org.example.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComposedItemTest {
    @Test
    public void testCreate() {
        ComposedItem item = new ComposedItem(33, "Hey", "Ho");

        Assertions.assertNotNull(item);
        Assertions.assertEquals(item.getCommon().getSomeCommonProp2(), "Hey");
        Assertions.assertEquals(item.getCommon().getSomeCommonProp1(), 33);
        Assertions.assertEquals(item.getDataThatCanBeOftenDifferent(), "Ho");
    }

    @Test
    public void testCreatingTwoComposedItemsWithIdenticalParamsAreNotTheSameButTheirCommonPartOnly() {
        ComposedItem item1 = new ComposedItem(33, "Hey", "Ho");
        ComposedItem item2 = new ComposedItem(33, "Hey", "Ho");

        Assertions.assertSame(item1.getCommon(), item2.getCommon());
        Assertions.assertNotSame(item1, item2);
    }
}
