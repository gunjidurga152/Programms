package org.example.Dsa_Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21,11,34,12,56,13,57,90};
        BubbleSort(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}



