package preptointerview;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.03.2022
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 56, 12, 21, 45, 3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        mem();
    }

    public static void bubble(Integer[] arr) {
        int n = arr.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                });
    }

    public static void mem() {

    }
}
