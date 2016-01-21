package com.goit.syrotskiy.luhnAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        if(LuhnAlgorithm.validateData(inputData())) {
            System.out.println("Validation successed!");
        } else System.out.println("Validation failed!");
    }

    private static int[] inputData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputArrayOfDigits = new int[16];
        System.out.print("Please, enter the number of your credit card (16 digits): ");

        while(true) {
            String inputData = reader.readLine();
            while(true) {
                if (inputData.length() != 16) {
                    System.out.println("[ERROR]: card number contains 16 digits! Try again!");
                    inputData = reader.readLine();
                } else {
                    break;
                }
            }

            try {
                String[] dataStringArray = inputData.split("");
                int i = 0;
                for (String str : dataStringArray) {
                    inputArrayOfDigits[i] = Integer.parseInt(str);
                    i++;
                }
                break;
            }catch (NumberFormatException ex) {
                System.out.println("[ERROR]: card number contains only digits [0-9]. Try again!");
            }
        }
        reader.close();
        return inputArrayOfDigits;
    }
}