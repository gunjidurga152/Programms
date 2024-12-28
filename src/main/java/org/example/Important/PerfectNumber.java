package org.example.Important;

// 6 -> 1 + 2 + 3 = 6=>sum of all divisiors eqaul to given Number
public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6; // Example number

        // Check and print if the number is perfect or not
        if (isPerfectNumber(n)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int n) {
        int sum = 0;

        // Find divisors of n and calculate their sum
        for (int i = 1; i <= n/2 ; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Check if the sum equals the number
        return sum == n;
    }
}



