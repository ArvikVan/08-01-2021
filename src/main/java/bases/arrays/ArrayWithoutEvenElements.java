package com.company.bases.arrays;

import java.util.Arrays;

//37. Массив без четных значений.
//Метод принимает массив целочисленных значений. Необходимо перебрать этот массив выбрать из него только нечетные
//числа и вернуть новый массив, в котором будут только нечетные числа. При этом длина нового массива должна совпадать
//с количеством нечетных значений в исходном массиве.
//В этой задаче будет необходимо использовать оператор continue.
public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
     /*   int count = 0, countAr = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]%2 != 0) count++;
        }
        int[] array = new int[count];
        for (int i = countAr; i < data.length; i++) {
            if (data[i]%2 != 0) {
                array[countAr] = data[i];
                countAr++;
            }
        } return array;*/
        int countAr = 0;
        int[] array = new int[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                array = Arrays.copyOf(array, ++countAr);
                array[countAr - 1] = data[i];
            }
        } return array;
    }
}
