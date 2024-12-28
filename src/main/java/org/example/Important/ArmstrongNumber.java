package org.example.Important;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Method to check if the number is Armstrong
    public static boolean isArmstrong(int n) {
        int OriNum = n;
        int sum = 0;
        int NumberOfDigits = (int) Math.log10(n) + 1;
        while (n > 0) {
            int digit = n % 10; //get the last element
            sum += Math.pow(digit,NumberOfDigits);
            n /= 10;
        }
        return sum == OriNum;
    }
}

