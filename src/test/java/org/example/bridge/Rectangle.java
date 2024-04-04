package org.example.bridge;

public class Rectangle implements Shape {
    private final Rendering rendering;

    public Rectangle(Rendering rendering) {
        this.rendering = rendering;
    }

    @Override
    public String draw() {
        return "Rendering Rectangle using " + this.rendering.render();
    }
}
