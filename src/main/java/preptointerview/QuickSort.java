package preptointerview;

import java.util.Arrays;

/**
 * @author ArvikV
 * @version 1.0
 * @since 07.03.2022
 * завершить выполнение если длина массива равна 0
 * завершить выполнение если уже нечего делить
 * выбрать опорный элемент
 * разделить на подмассивы, который больше и меньше опорного элемента
 * меняем местами
 * вызов рекурсии для сортировки левой и правой части
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        sort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

    public static void sort(int[] arr, int low, int hight) {
        /*завершить выполнение если длина массива равна 0
          завершить выполнение если уже нечего делить*/
        if (arr.length == 0) {
            return;
        }

        if (low >= hight) {
            return;
        }

        /*выбрать опорный элемент*/
        int middle = low + (hight - low) / 2;
        int opora = arr[middle];

        /*разделить на подмассивы, который больше и меньше опорного элемента*/
        int i = low, j = hight;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            /*меняем местами*/
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            sort(arr, low, j);
        }

        if (hight > i) {
            sort(arr, i, hight);
        }
    }
}
