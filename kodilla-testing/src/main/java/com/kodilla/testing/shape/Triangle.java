package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (double) (a * h) / 2;
    }
}