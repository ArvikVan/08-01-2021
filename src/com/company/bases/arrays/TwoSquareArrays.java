package com.company.bases.arrays;
//29. Двумерные массивы в одномерный массив.
//Метод принимает 2 двумерных квадратных массива.Вам необходимо реализовать метод который осуществит
//конвертацию двумерного массива в одномерный, при этом необходимо выполнить условия: при переборе
//двумерных массивов осуществить сравнение элементов, которые стоят на местах с одинаковыми индексами,
//и вернуть максимальное из сравниваемых значений. Максимальное из двух значений необходимо вставить
//в результирующий массив.
public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int length = left[0].length * left.length;
        int[] collectMax = new int[length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (left[i][j] < right[i][j]) {
                    collectMax[count] = right[i][j];
                } else {
                    collectMax[count] = left[i][j];
                }
                count++;
            }
        }
        return collectMax;
    }
}
