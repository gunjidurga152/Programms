package org.example;

import java.util.Scanner;

public class OddNumberDoWhile {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int i=1;
        do{
            if(i%2==1){
                System.out.println(i);
            }
            i++;
        }while(i<=num);
    }
}
