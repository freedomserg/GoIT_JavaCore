package com.goit.Module4.Distance;

public class CalculateDistance {
    public static void main(String[] args) {
        int x1 = -1;
        int y1 = 3;

        int x2 = 0;
        int y2 = -5;

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The distance between two points with coordinates (%d;%d) and (%d;%d): %.2f", x1, y1, x2, y2, distance);
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
