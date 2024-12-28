package org.example.Functions;

public class Even {
    public static void main(String[]args){
       int n=5;
         boolean b=isEven(n);
         System.out.println(b);
    }
    public static boolean isEven(int n){
        return n%2==0;
    }

}
