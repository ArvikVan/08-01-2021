package com.company.bases.cycles;

import java.util.Scanner;

public class Ex3Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sumvklad = scanner.nextFloat();
        System.out.print("Введите срок вклада: ");
        int time = scanner.nextInt();
        float prib = 0;
        for (int i = 1; i <= time; i++) {
            sumvklad += sumvklad * 0.07;
            //sumvklad = sumvklad + sumvklad * 0.07; не работает, требует приведения к типу float
        }
        System.out.println("После " + time + " месяцев сумма вклада составит " + sumvklad);

    }
}
