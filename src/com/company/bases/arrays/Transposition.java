package com.company.bases.arrays;
// 17. Транспонировать матрицу
public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j)
                result[i][j] = matrix[j][i];
        }
        return result;
    }

}
