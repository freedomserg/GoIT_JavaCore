package com.goit.syrotskiy.module4.geometric_figures;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    private Circle circle;

    @Test(timeout = 1000)
    public void testCalculateSquare() throws Exception {
        int radius = 3;
        circle = new Circle(radius);
        circle.calculateSquare();

        Assert.assertEquals(Math.PI * Math.pow(radius, 2), circle.getSquare(), 0.00);
    }
}