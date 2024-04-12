package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item implements Composite<Item> {
    private final String name;
    private final ArrayList<Item> children = new ArrayList<Item>();

    public Item(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    public List<Item> getChildren() {
        return children;
    }

    @Override
    public void addChild(Item child) {
        children.add(child);
    }

    @Override
    public String listItem() {
        return this.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(getName(), item.getName()) && Objects.equals(getChildren(), item.getChildren());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getChildren());
    }

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(final int indentationLevel) {
        final String indentation = "  ";
        final String nodeName = "Item{name='" + name + "'}\n";

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nodeName);

        for (Item child : children) {
            stringBuilder
                .append(indentation.repeat(indentationLevel + 1))
                .append(child.toString(indentationLevel + 1 ));
        }

        return stringBuilder.toString();
    }
}
