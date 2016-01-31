package com.goit.syrotskiy.module5.matrixCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {

    public static int[][] getFilledMatrix() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] inputMatrix = getEmptyMatrix();

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");

                boolean incorrectData = true;
                while(incorrectData) {
                    try {
                        inputMatrix[i][j] = Integer.parseInt(reader.readLine());
                        incorrectData = false;
                    } catch (NumberFormatException ex) {
                        System.out.println("[ERROR]: The element of the matrix should be an integer digit! Try again!");
                    }
                }
            }
        }
        return inputMatrix;
    }


    private static int[][] getEmptyMatrix() throws IOException {
        boolean incorrectDimension = true;
        int[] matrixDimension = null;
        int m = 0;
        int n = 0;

        while (incorrectDimension) {
            try {
                System.out.print("Enter the dimension of the matrix: ");
                matrixDimension = getMatrixDimension();

                m = matrixDimension[0];
                n = matrixDimension[1];

                if (m > 0 && n > 0) incorrectDimension = false;
                else {
                    System.out.println("[ERROR]: The dimension cannot be zero or negative! Try again!");
                }
            } catch (IllegalInputDataMatrixException exc) {
                System.out.println("[ERROR]: The dimension should be an integer digit! Try again!");
            }
        }
        return new int[m][n];
    }


    private static int[] getMatrixDimension() throws IOException, IllegalInputDataMatrixException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = 0;
        int c = 0;

        try {
            System.out.print("m = ");
            String rows = reader.readLine();

            r = Integer.parseInt(rows);
            System.out.print("n = ");
            String colomns = reader.readLine();
            c = Integer.parseInt(colomns);
        } catch (NumberFormatException exc) {
            throw new IllegalInputDataMatrixException();
        }
        return new int[] {r, c};
    }


    public static void printMatrix(int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                System.out.print(inputMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int getIntegerDigit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = 0;

        boolean incorrectNumber = true;
        while(incorrectNumber) {
            try {
                System.out.print("digit = ");
                String number = reader.readLine();
                digit = Integer.parseInt(number);
                incorrectNumber = false;
            } catch (NumberFormatException exc) {
                System.out.println("[ERROR]: The number should be an integer digit! Try again!");
            }
        }
        return digit;
    }
}
