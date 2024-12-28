package org.example;

import java.util.Scanner;

public class EvenNumberDoWhile {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int i=2;
        do{
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }while(i<=num);
    }
}
