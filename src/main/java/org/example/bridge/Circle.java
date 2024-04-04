package org.example.bridge;

public class Circle implements Shape {
    private final Rendering rendering;

    public Circle(Rendering rendering) {
        this.rendering = rendering;
    }

    @Override
    public String draw() {
        return "Rendering Circle using " + this.rendering.render();
    }
}
