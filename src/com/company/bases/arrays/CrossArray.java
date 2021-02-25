package com.company.bases.arrays;

import java.util.Arrays;

// 2. Одинаковые элементы для массивов
public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                    break;
                }
            }
        }
        // Arrays.equals(left, right);
    }
}
