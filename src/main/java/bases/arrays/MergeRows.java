package com.company.bases.arrays;
// 25. Объединить строки квадратного массива
public class MergeRows {
    public static int[] merge(int[][] data) {
        int length = data.length * data.length;
        int[] merg = new int[length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                merg[count] = data[i][j];
                count++;
            }
        }
        return merg;
    }
}
