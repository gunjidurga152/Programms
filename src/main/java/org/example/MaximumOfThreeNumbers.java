package org.example;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b){
            System.out.println(a+"is max number");
        }else if(b>c){
            System.out.println(b+"is max number");
        }else if(a<c){
            System.out.println(c+"is max number");
        }
    }

}
