package com.goit.syrotskiy.module4.geometric_figures;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void calculateSquare() {
        square = sideA * sideB;
    }

    @Override
    public String toString() {
        return "The square of the rectangle: " + square;
    }
}
