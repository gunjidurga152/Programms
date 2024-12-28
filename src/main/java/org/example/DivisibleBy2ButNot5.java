package org.example;

import java.util.Scanner;

public class DivisibleBy2ButNot5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%2==0 && n%5!=0){
            System.out.println(n+" is divisible but 2 but not 5");
        }else{
            System.out.println(n+" condition not satisfied");
        }
    }
}
