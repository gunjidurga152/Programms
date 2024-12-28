package org.example;

import java.util.Scanner;

public class OddNumbersWhile {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int i=1;
        while(i<=num) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
