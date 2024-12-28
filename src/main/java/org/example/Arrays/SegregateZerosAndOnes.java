package org.example.Arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1,1,0};
        int j=0;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                arr[j++] = arr[i];
            }
        }
            while(j<arr.length){
                arr[j++]=1;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

}
