package com.goit.syrotskiy.module5.matrixCalculator;

import org.junit.Assert;
import org.junit.Test;

public class MatrixOperationsUtilTest {

    @Test(timeout = 100)
    public void validDataMatrixAddition() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1, 5},
                {-5, 3, 1, 4}
        };
        int[][] matrix2 = {
                {-2, -1, 1, 7},
                {-9, 9, -1, 3}
        };
        int[][] expectedResultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < expectedResultMatrix.length; i++) {
            for (int j = 0; j < expectedResultMatrix[i].length; j++) {
                expectedResultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixAddition(matrix1, matrix2));
    }

    @Test(timeout = 100, expected = InappropriateMatrixDimensionException.class)
    public void invalidDataMatrixAddition() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1},
                {-5, 3, 1}
        };
        int[][] matrix2 = {
                {-2, -1, 1, 7},
                {-9, 9, -1, 3}
        };
        int[][] expectedResultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < expectedResultMatrix.length; i++) {
            for (int j = 0; j < expectedResultMatrix[i].length; j++) {
                expectedResultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixAddition(matrix1, matrix2));
    }

    @Test(timeout = 100)
    public void validDataMatrixSubtraction() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1, 5},
                {-5, 3, 1, 4}
        };
        int[][] matrix2 = {
                {-2, -1, 1, 7},
                {-9, 9, -1, 3}
        };
        int[][] expectedResultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < expectedResultMatrix.length; i++) {
            for (int j = 0; j < expectedResultMatrix[i].length; j++) {
                expectedResultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixSubtraction(matrix1, matrix2));
    }

    @Test(timeout = 100, expected = InappropriateMatrixDimensionException.class)
    public void invalidDataMatrixSubtraction() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1},
                {-5, 3, 1, 4}
        };
        int[][] matrix2 = {
                {-2, -1, 1, 7},
                {-9, 9, -1, 3}
        };
        int[][] expectedResultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < expectedResultMatrix.length; i++) {
            for (int j = 0; j < expectedResultMatrix[i].length; j++) {
                expectedResultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixSubtraction(matrix1, matrix2));
    }

    @Test(timeout = 100)
    public void validDataMatrixMultiply() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1},
                {-5, 3, 1}
        };
        int[][] matrix2 = {
                {2, 1},
                {9, 9},
                {1, 3}
        };
        int m = matrix1.length;
        int n = matrix2[0].length;
        int l = matrix2.length;
        int[][] expectedResultMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < l; k++) {
                    expectedResultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixMultiply(matrix1, matrix2));
    }

    @Test(timeout = 100, expected = InappropriateMatrixDimensionException.class)
    public void invalidDataMatrixMultiply() throws Exception {
        int[][] matrix1 = {
                {0, 0, -1},
                {-5, 3, 1}
        };
        int[][] matrix2 = {
                {2, 1, 0},
                {9, 9, 7}
        };
        int m = matrix1.length;
        int n = matrix2[0].length;
        int l = matrix2.length;
        int[][] expectedResultMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < l; k++) {
                    expectedResultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixMultiply(matrix1, matrix2));
    }

    @Test(timeout = 100)
    public void testMatrixMultiplyToNumber() throws Exception {
        int[][] matrix = {
                {0, 0, -1},
                {-5, 3, 1}
        };
        int digit = -2;
        int[][] expectedResultMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < expectedResultMatrix.length; i++) {
            for (int j = 0; j < expectedResultMatrix[i].length; j++) {
                expectedResultMatrix[i][j] = matrix[i][j] * digit;
            }
        }
        Assert.assertArrayEquals(expectedResultMatrix, MatrixOperationsUtil.matrixMultiplyToNumber(matrix, digit));
    }
}