package com.company.bases.arrays;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[src].length];
        for (int i = 0; i <= data[src].length - 1; i++) {
            temp[i] = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp[i];
        }
    }
}
