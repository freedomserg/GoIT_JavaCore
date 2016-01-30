package com.goit.syrotskiy.module4.distance;

import org.junit.Assert;
import org.junit.Test;

public class DistanceCalculateUtilitiesTest {
    private Point pointA;
    private Point pointB;

    @Test(timeout = 1000)
    public void differentValueOfCoordinates() throws Exception {
        pointA = new Point(-3, 3);
        pointB = new Point(-5, 2);
        double expectedResult = Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
        double actualResult = DistanceCalculateUtilities.calculateDistance(pointA, pointB);

        Assert.assertEquals(expectedResult, actualResult, 0.00);
    }

    @Test(timeout = 1000)
    public void sameValueOfCoordinates() throws Exception {
        pointA = new Point(1, 1);
        pointB = new Point(1, 1);
        double actualResult = DistanceCalculateUtilities.calculateDistance(pointA, pointB);

        Assert.assertEquals(0.00, actualResult, 0.00);
    }
}