package org.example.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompositeTest {
    @Test
    public void testCreateItem() {
        // Arrange
        Item item = new Item("Item name 1");

        // Act
        final String actual = item.listItem();

        // Assert
        Assertions.assertEquals("Item{name='Item name 1'}\n", actual);
    }

    @Test
    public void testAddSubItems() {
        // Arrange
        Item item = new Item("Item name 0");
        Item subItem1 = new Item("Item name 1");
        Item subItem2 = new Item("Item name 2");
        List<Item> expected = new ArrayList<>(
                Arrays.asList(
                        new Item("Item name 1"),
                        new Item("Item name 2")
                )
        );

        // Act
        item.addChild(subItem1);
        item.addChild(subItem2);

        // Assert
        Assertions.assertIterableEquals(item.getChildren(), expected);
    }

    @Test
    public void testListItemChildren() {
        // Arrange
        Item item = new Item("Item name 0");
        Item subItem1 = new Item("Item name 1");
        Item subItem2 = new Item("Item name 2");
        Item subItem3 = new Item("Item name 3");
        Item subItem4 = new Item("Item name 4");
        Item subItem5 = new Item("Item name 5");
        item.addChild(subItem1);
        subItem1.addChild(subItem4);
        subItem1.addChild(subItem3);
        item.addChild(subItem2);
        subItem2.addChild(subItem5);

        final String expected =
                "Item{name='Item name 0'}\n" +
                "  Item{name='Item name 1'}\n" +
                "    Item{name='Item name 4'}\n" +
                "    Item{name='Item name 3'}\n" +
                "  Item{name='Item name 2'}\n"+
                "    Item{name='Item name 5'}\n";

        // Act
        final String actual = item.listItem();

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
