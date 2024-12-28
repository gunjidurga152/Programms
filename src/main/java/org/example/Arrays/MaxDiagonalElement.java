package org.example.Arrays;

import java.util.Scanner;

public class MaxDiagonalElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the matrix
        System.out.println("Enter the size of the matrix:");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // Corrected condition
                array[i][j] = scanner.nextInt();
            }
        }

        // Call MaxElement and print the result
        int maxDiagonalElement = MaxElement(array);
        System.out.println("Maximum diagonal element: " + maxDiagonalElement);

        // Close the scanner
        scanner.close();
    }

    public static int MaxElement(int[][] array) {
        int n = array.length;
        int max = Integer.MIN_VALUE;

        // Compare elements of primary and secondary diagonals
        for (int i = 0; i < n; i++) {
            max = Math.max(max, array[i][i]); // Primary diagonal
            max = Math.max(max, array[i][n - i - 1]); // Secondary diagonal
        }
        return max;
    }
}

