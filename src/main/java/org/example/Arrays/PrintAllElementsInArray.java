package org.example.Arrays;

public class PrintAllElementsInArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        AllElements(array);
    }
    public static void AllElements(int[] array){
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }
}
