package org.example.Functions;

public class OddNumbers {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        OddNumbersInArray(array);
    }
    public static void OddNumbersInArray(int[] array){
        for(int i=0;i<=array.length-1;i++){
            if(array[i]%2==1){
                System.out.println(array[i]);
            }
        }
    }
}
