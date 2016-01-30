package com.goit.syrotskiy.module4.geometric_figures;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    private Triangle triangle;

    @Test(timeout = 1000)
    public void testCalculateSquare() throws Exception {
        int sideA = 3;
        int sideB = 5;
        int sideC = 2;
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        triangle = new Triangle(sideA, sideB, sideC);

        Assert.assertEquals(Math.sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC)),
                triangle.getSquare(), 0.00);
    }
}