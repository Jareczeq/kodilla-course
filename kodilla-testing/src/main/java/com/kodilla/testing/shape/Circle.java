package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * (radius * radius);
    }
}
