package org.example.Arrays;

import java.util.Scanner;

public class SumDiagonalElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] Array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int[] matrix : Array) {
             for (int value : matrix) {
               System.out.print(value + " ");
           }
           System.out.println();
      }
        DiagonalSum(Array);
    }
    public static void DiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }
}


