package com.company.bases.arrays;
// 1. Проверить сортировку массива
public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}
