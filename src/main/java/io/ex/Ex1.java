package io.ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ArvikV
 * @version 1.0
 * @since 31.03.2022
 */
public class Ex1 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        String two = scanner.nextLine();
        System.out.println(two);
        Double d = Double.parseDouble(s);
        System.out.println(d);
        double dvs = scanner.nextDouble();
        System.out.println(dvs);*/
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
