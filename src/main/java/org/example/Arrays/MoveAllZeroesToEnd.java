package org.example.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] array={1,3,2,0,0,2,1,2,0};

        int count=0;
        for(int i=0;i<array.length;i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
            while(count<array.length-1){
                array[count++]=0;
            }
            for(int v:array){
                System.out.print(v+" ");
            }
        }

}
