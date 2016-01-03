package com.goit.syrotskiy.module5.matrixCalculator;

public class MatrixOperationsUtil {
    public static int[][] matrixAddition(int[][] firstMatrix, int[][] secondMatrix) throws InappropriateMatrixDimensionException {
        if ((firstMatrix.length != secondMatrix.length) && (firstMatrix[0].length != secondMatrix[0].length)) {
            throw new InappropriateMatrixDimensionException();
        }
        int[][] resultMatrix = new int[firstMatrix.length][firstMatrix[0].length];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return resultMatrix;
    }


    public static int[][] matrixSubtraction(int[][] firstMatrix, int[][] secondMatrix)throws InappropriateMatrixDimensionException {
        return matrixAddition(firstMatrix, matrixMultiplyToNumber(secondMatrix, -1));
    }

    public static int[][] matrixMultiply(int[][] firstMatrix, int[][] secondMatrix)throws InappropriateMatrixDimensionException {
        if (firstMatrix[0].length != secondMatrix.length) {
            throw new InappropriateMatrixDimensionException();
        }
        int m = firstMatrix.length;
        int n = secondMatrix[0].length;
        int l = secondMatrix.length;
        int[][] resultMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < l; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultMatrix;
    }


    public static int[][] matrixMultiplyToNumber(int[][] matrix3, int digit){
        int[][] resultMatrix = new int[matrix3.length][matrix3[0].length];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = matrix3[i][j] * digit;
            }
        }
        return resultMatrix;
    }
}


