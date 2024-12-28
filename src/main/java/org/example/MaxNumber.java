package org.example;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int contestant1=scanner.nextInt();
        int contestant2=scanner.nextInt();
        int contestant3=scanner.nextInt();
        int maxScore=FindMaximum(contestant1,contestant2,contestant3);
        System.out.println("The highest score is: "+maxScore);
    }

    private static int FindMaximum(int contestant1, int contestant2, int contestant3) {
        int maximum=contestant1;

        if(contestant2>maximum) {
            maximum=contestant2;
        }
        if(contestant3>maximum) {
            maximum=contestant3;
        }
        return maximum;
    }
}
