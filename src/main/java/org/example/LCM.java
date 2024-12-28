package org.example;

public class LCM {
    public static void main(String[]args){
        int a=5;
        int b=7;
        int lcm=(a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println(a+" and"+b+"lcm is "+lcm);
                break;
            }
            lcm++;
        }
    }

}
