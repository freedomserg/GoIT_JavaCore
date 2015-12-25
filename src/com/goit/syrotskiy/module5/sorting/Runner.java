package com.goit.syrotskiy.module5.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputDataArray = DataInputUtil.dataInput();
        System.out.print("input array before sorting: ");
        System.out.println(Arrays.toString(inputDataArray));

        System.out.print("Choose sorting method (1 - BubbleSort, 2 - InsertionSort): ");
        byte key = scanner.nextByte();

        switch (key) {
            case 1: BubbleSortUtil.bubbleSort(inputDataArray);
                System.out.print("after sorting: ");
                System.out.println(Arrays.toString(inputDataArray));
                break;
            case 2: InsertionSortUtil.insertionSort(inputDataArray);
                System.out.print("after sorting: ");
                System.out.println(Arrays.toString(inputDataArray));
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}
