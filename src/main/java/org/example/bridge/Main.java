package org.example.bridge;

public class Main {
    public static void main(String[] args) {
        Rendering svgRendering = new SVGRenderer();
        Rendering canvasRendering = new CanvasRenderer();

        Shape svgCircle = new Circle(svgRendering);
        Shape canvasCircle = new Circle(canvasRendering);
        Shape svgRectangle = new Rectangle(svgRendering);
        Shape canvasRectangle = new Rectangle(canvasRendering);

        System.out.println(svgCircle.draw());
        System.out.println(canvasCircle.draw());
        System.out.println(svgRectangle.draw());
        System.out.println(canvasRectangle.draw());
    }
}
