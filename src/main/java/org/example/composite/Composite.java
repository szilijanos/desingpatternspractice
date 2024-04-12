package org.example.composite;

import java.util.List;

public interface Composite<T> {
    List<T> getChildren();
    void addChild(T child);
    String listItem();
}
