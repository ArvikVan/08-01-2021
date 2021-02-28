package com.company.bases.arrays;
//30. Превратить одномерный массив в двумерный.
//Метод принимает массив целочисленных значений. Необходимо реализовать метод, который превратит одномерный массив в
//квадратный двумерный. Напомню, что квадратный двумерный массив - это массив, в котором число рядов и элементов в
//каждом ряду одинаково. При этом если элементов в исходном массиве не хватает, чтобы заполнить весь двумерный массив
//- необходимо заполнить его 0.
public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int countCell = 0;
        int length = (int) (Math.ceil(Math.sqrt(array.length/2)) +1);
        int convertArr[][]= new int[length][length];
            for (int row = 0; row < convertArr.length; row++) {
                for (int cell = 0; cell < convertArr.length; cell++, countCell++) {
                    if (countCell < array.length) {
                        convertArr[row][cell] = array[countCell];
                    } else {
                        convertArr[row][cell] = 0;
                    }
                }
            }
        return convertArr;
    }
}
