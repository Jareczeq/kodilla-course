package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {

        if (shapes.isEmpty()) {
            return "There are no shapes!";
        }

        Shape firstShape = shapes.get(0);
        StringBuilder sb = new StringBuilder("Shapes: " + firstShape.getShapeName());

        for (int i = 1; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sb.append(", " + shape.getShapeName());
        }


        return sb.toString();

    }

    public int getCountFigures() {
        return shapes.size();
    }

}