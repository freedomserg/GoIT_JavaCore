package com.goit.Mmodule4.distance;

public class DistanceCalculateUtilities {

    public static double calculateDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
    }
}
