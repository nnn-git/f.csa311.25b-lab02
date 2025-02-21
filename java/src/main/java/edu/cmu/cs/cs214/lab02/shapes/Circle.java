package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;  // radius хувийг private болгоно

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
