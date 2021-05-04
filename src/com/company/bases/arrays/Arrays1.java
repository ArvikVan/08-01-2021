package com.company.bases.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = new int[] {23, 24, 25, 26, 27};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Либо другое использование цикда for ");
        int[] arr2 = new int[] {11, 12, 13, 14, 15};
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] * 2;
            System.out.print(arr2[i] + " ");
        }
    }
}
