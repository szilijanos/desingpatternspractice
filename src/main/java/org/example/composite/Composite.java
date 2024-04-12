package org.example.composite;

import java.util.List;

public interface Composite<T> {
    public List<T> getChildren();
    public void addChild(T child);
    public String listItem();
}
