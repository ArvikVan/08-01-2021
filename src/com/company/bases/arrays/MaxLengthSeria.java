package com.company.bases.arrays;
// 22. Максимальная длина неубывающей последовательности
// Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
// Длина последовательности это количество элементов, которые в нее входят.  В массиве таких последовательностей
// может быть несколько, вам нужно найти длину максимальной из них.
public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int result = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i+1]) {
                count++;
                if (result < count) result = count;
            } else count = 1;
        }
        return count;
    }
}
