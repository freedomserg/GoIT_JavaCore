package Module4.GeometricFigures;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void calculateSquare() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        square = Math.sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC));
    }

    @Override
    public String toString() {
        return "The square of the triangle: " + square;
    }
}
