package com.goit.module4.geometric_figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        square = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "The square of the circle: " + square;
    }
}
