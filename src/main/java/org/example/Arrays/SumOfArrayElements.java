package org.example.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        Sum(array);
    }
    public static void Sum(int[]array){
        int sum=0;
        for(int i=0;i<=array.length-1;i++){
            sum=sum+array[i];
        }
        System.out.println(sum);

        //Average 
        int average=sum/array.length;
        System.out.println(average);

    }


}
