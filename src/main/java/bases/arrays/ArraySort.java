package bases.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int i = scanner.nextInt();
        int[] arr = new int[i];

        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = (int) (j * Math.random() * 10);
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
