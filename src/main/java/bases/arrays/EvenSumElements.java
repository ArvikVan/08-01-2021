package com.company.bases.arrays;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        if (sum % 2 == 0) {
            return true;
        }
            return false;
    }
}
