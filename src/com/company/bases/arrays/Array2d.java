package com.company.bases.arrays;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int i = scanner.nextInt();
        int [][] array = new int[i][];
        for (int j = 0; j < i; j++) {
            array[j] = new int[i];
            i--;
        }

        for (int j = 0; j < array.length-1; j++) {
            for (int k = 0; k < array[j].length; k++) {
                System.out.print(" " + array[j][k] + " ");
            }
            System.out.println();
        }
    }
}
