package com.goit.syrotskiy.module5.searchMinMax;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] inputDataArray = DataInputUtil.dataInput();
        int min = SearchMinMaxUtil.searchMin(inputDataArray);
        int max = SearchMinMaxUtil.searchMax(inputDataArray);

        System.out.println("input array: " + Arrays.toString(inputDataArray));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
