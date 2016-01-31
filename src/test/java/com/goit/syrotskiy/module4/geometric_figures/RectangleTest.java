package com.goit.syrotskiy.module4.geometric_figures;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @Test(timeout = 1000)
    public void testCalculateSquare() throws Exception {
        int sideA = 2;
        int sideB = 3;
        rectangle = new Rectangle(sideA, sideB);
        rectangle.calculateSquare();

        Assert.assertEquals(sideA * sideB, rectangle.getSquare(), 0.00);
    }
}