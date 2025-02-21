package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        
        Shape shape = new Square(4);  
        Renderer renderer = new Renderer(shape);
        renderer.draw();
        
        
        Shape rectangle = new Rectangle(2, 3);
        Renderer rectangleRenderer = new Renderer(rectangle);
        rectangleRenderer.draw();
        
        Shape circle = new Circle(5);
        Renderer circleRenderer = new Renderer(circle);
        circleRenderer.draw();
    }
}
