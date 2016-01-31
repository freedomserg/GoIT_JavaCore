package com.goit.syrotskiy.module4.distance;

public class Runner {
    public static void main(String[] args) {
        Point a = new Point(-1, 1);
        Point b = new Point(5, 0);
        double distance = DistanceCalculateUtilities.calculateDistance(a, b);
        System.out.printf("The distance between two points with coordinates (%d;%d) and (%d;%d): %.2f",
                a.getX(), a.getY(), b.getX(), b.getY(), distance);
    }
}
