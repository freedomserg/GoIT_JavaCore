package com.goit.syrotskiy.module5.matrixCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] firstMatrix;
        int[][] secondMatrix;
        int[][] resultMatrix = null;

        try {
            System.out.println("Please, enter the matrix: ");
            firstMatrix = IOUtil.getFilledMatrix();

            System.out.print("Please, choose an operation (1 - addition, 2 - subtraction, " +
                    "3 - multiplication, 4 - multiplication on the number): ");

            boolean incorrectNumber = true;
            while (incorrectNumber) {
                String key = reader.readLine();
                switch (key) {
                    case "1":
                        System.out.println("Please, enter the second matrix: ");
                        secondMatrix = IOUtil.getFilledMatrix();
                        resultMatrix = MatrixOperationsUtil.matrixAddition(firstMatrix, secondMatrix);
                        incorrectNumber = false;
                        break;
                    case "2":
                        System.out.println("Please, enter the second matrix: ");
                        secondMatrix = IOUtil.getFilledMatrix();
                        resultMatrix = MatrixOperationsUtil.matrixSubtraction(firstMatrix, secondMatrix);
                        incorrectNumber = false;
                        break;
                    case "3":
                        System.out.println("Please, enter the second matrix: ");
                        secondMatrix = IOUtil.getFilledMatrix();
                        resultMatrix = MatrixOperationsUtil.matrixMultiply(firstMatrix, secondMatrix);
                        incorrectNumber = false;
                        break;
                    case "4":
                        int digit = IOUtil.getIntegerDigit();
                        resultMatrix = MatrixOperationsUtil.matrixMultiplyToNumber(firstMatrix, digit);
                        incorrectNumber = false;
                        break;
                    default:
                        System.out.println("[ERROR]: You have entered the wrong item! Try again!");
                }
            }
            System.out.println();
            System.out.println("Result:");
            IOUtil.printMatrix(resultMatrix);
        } catch (InappropriateMatrixDimensionException ex) {
            System.out.println("[ERROR]: The operation cannot be executed! Inappropreate dimensions of the input matrixes!");
        }
    }
}
