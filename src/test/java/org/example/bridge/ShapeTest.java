package org.example.bridge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void testRenderCircleWithSVG() {
        Rendering rendering = new SVGRenderer();
        Shape circle = new Circle(rendering);
        assertEquals("Rendering Circle using SVG", circle.draw());
    }

    @Test
    public void testRenderCircleWithCanvas() {
        Rendering rendering = new CanvasRenderer();
        Shape circle = new Circle(rendering);
        assertEquals("Rendering Circle using Canvas", circle.draw());
    }

    @Test
    public void testRenderRectangleWithSVG() {
        Rendering rendering = new SVGRenderer();
        Shape rectangle = new Rectangle(rendering);
        assertEquals("Rendering Rectangle using SVG", rectangle.draw());
    }

    @Test
    public void testRenderRectangleWithCanvas() {
        Rendering rendering = new CanvasRenderer();
        Shape rectangle = new Rectangle(rendering);
        assertEquals("Rendering Rectangle using Canvas", rectangle.draw());
    }
}
