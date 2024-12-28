package org.example.Functions;

public class EvenNumbers {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        EvenNumbersInArray(array);
    }
    public static void EvenNumbersInArray(int[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
