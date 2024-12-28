package org.example;

import java.util.Scanner;

public class printNumbersDoWhile {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=num);
    }
}