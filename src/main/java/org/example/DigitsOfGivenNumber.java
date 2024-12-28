package org.example;

import java.util.Scanner;

public class DigitsOfGivenNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        while(number>0){
            int digit=number%10;     //get the last digit
            number/=10;
            System.out.println(digit);
        }
    }
}
