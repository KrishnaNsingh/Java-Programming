package LabUnit2;

// import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Sum of Matrices:");
        for (int[] row : sum) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}