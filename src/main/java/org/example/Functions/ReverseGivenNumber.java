package org.example.Functions;
import java.util.*;
public class ReverseGivenNumber {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int result=ReverseNumber(n);
        System.out.println(result);
    }

    private static int ReverseNumber(int n) {
        int reversed =0;
        while(n>0){
            int digit=n%10;
            reversed =reversed*10+digit;
            n/=10;
        }
        return reversed;
    }


}
