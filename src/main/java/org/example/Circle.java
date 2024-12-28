package org.example;

import java.util.Scanner;


public class Circle {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double radius=5;
        double PI=3.14;

        //area of circle

        double area=PI*radius*radius;
        System.out.println(area);

    }

}
