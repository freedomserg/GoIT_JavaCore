package com.goit.syrotskiy.module5.searchMinMax;

import java.util.Scanner;

public class DataInputUtil {
    public static int[] dataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the length of the array: ");
        int length = scanner.nextInt();

        int[] inputDataArray = new int[length];
        for (int i = 0; i < inputDataArray.length; i++) {
            System.out.print("inputDataArray[" + i + "] = ");
            inputDataArray[i] = scanner.nextInt();
        }
        return inputDataArray;
    }
}
