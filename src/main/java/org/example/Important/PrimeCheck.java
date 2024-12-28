package org.example.Important;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 13;

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
