package com.goit.syrotskiy.module4.geometric_figures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedTriangleTest {
    private Triangle triangle;
    private double sideA;
    private double sideB;
    private double sideC;
    private double expected;

    public ParameterizedTriangleTest(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][]{
                {2.0, 5.0, 3.5},
                {2.0, 5.1, 3.4},
                {2.1, 5.2, 3.5},
                {2.2, 5.1, 3.4}
        });
    }


    @Test(timeout = 1000)
    public void testCalculateSquare() throws Exception {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        expected = Math.sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC));

        triangle = new Triangle(sideA, sideB, sideC);
        triangle.calculateSquare();
        double actual = triangle.getSquare();

        Assert.assertEquals(expected, actual, 0.00);
    }
}