package com.company.bases.arrays;
// 19. Вывести нечетные в порядке возрастания индексов
// Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве нечетные числа в
// порядке возрастания их индексов. Для вывода использовать System.out.println()
public class OddPrint {
    public static void print(int[] array) {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            if (array[i]%2 != 0) System.out.println(array[i]);
        }
    }
}
