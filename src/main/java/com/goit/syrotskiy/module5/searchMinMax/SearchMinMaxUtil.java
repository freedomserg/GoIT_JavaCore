package com.goit.syrotskiy.module5.searchMinMax;

public class SearchMinMaxUtil {
    public static int searchMin(final int[] arr) {
        int min = arr[0];
        for (int unit : arr) {
            if (unit < min) {
                min = unit;
            }
        }
        return min;
    }

    public static int searchMax(final int[] arr) {
        int max = arr[0];
        for (int unit : arr) {
            if (unit > max) {
                max = unit;
            }
        }
        return max;
    }
}
