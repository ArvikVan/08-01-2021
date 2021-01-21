package com.company.bases.arrays;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int le = scanner.nextInt();

        int[] arr = new int[le];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int indexmax = 0; //переменная для хранения индекса максимлаьного значения
        int max = arr[0];//переменная для храниния макс.значения
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                indexmax = i ;
            }
        }
        System.out.printf("Max element is %d with index %d", max, indexmax);
    }
}
