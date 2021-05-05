package com.company.bases.cycles;

import java.util.Scanner;

public class Ex4Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float vklad = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int month = scanner.nextInt();
        int i = month;

        while (i > 0) {
            vklad += vklad * 0.07;
            i--;
        }
        System.out.println("Общая прибыль составит: " + vklad);
    }
}
