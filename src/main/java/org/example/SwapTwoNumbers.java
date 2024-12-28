package org.example;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= 5;
        int b=6;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
}
