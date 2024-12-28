package org.example.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int [] arr={23,45,54,7,89,25};

        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;

        for(int num:arr) {

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != second) {
                second = num;
            }
        }
            if(second==Integer.MIN_VALUE){
                System.out.println("Highest Value Not found");
            }else{
                System.out.println("Second Highest number "+second);
            }

    }
}
