package com.company.bases.arrays;

import java.util.Arrays;

//31. Конвертировать неквадратный двумерный массив в квадратный.
public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int l = 0;
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            l = l + array[row].length;
        }
        int[] tempArr = new int[l];
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                tempArr[count] = array[row][cell];
                count++;
            }
        }
        int length = (int) (Math.ceil(Math.sqrt(tempArr.length/2)) +1);
        System.out.println(l);
        System.out.println(Arrays.toString(tempArr));

        int countS = 0;
        int[][] arraySquare = new int[length][length];
        for (int i = 0; i < arraySquare.length; i++) {
            for (int j = 0; j < arraySquare.length; j++, countS++) {
                if (countS < tempArr.length) {
                    arraySquare[i][j] = tempArr[countS];
                } else {
                    arraySquare[i][j] = 0;
                }
            }
        }
        return arraySquare;
    }
}
