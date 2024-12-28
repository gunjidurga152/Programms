package org.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SortingAndAlternatingArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 0};
        List<Integer> result = new ArrayList<>();
        int count0 = 0;
        int count1 = 0;

        //count o's and 1's
        for (int num : array) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            }
        }

        //Generate alternating sequence
        while (count0 > 0 || count1 > 0) {
            if (count0 > 0) {
                result.add(0);
                count0--;
            }
            if (count1 > 0) {
                result.add(1);
                count1--;
            }
        }
        System.out.print(result);
    }
}
