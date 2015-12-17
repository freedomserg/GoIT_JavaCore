package Module4.GeometricFigures;

import java.util.ArrayList;
import java.util.List;

public class CalculateSquareOfFigures {

    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(7, 4, 5));
        figures.add(new Rectangle(5, 7));
        figures.add(new Circle(4));

        for (Figure figure : figures) {
            figure.calculateSquare();
            System.out.println(figure.toString());
        }

    }
}
