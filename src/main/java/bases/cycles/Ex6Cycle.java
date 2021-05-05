package com.company.bases.cycles;

import java.util.Scanner;

public class Ex6Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        do {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            System.out.println("Результат умножения введенных чисел: " + num1 * num2);

            System.out.println("Продолжить? ");
            cont = scanner.nextInt();
        } while (cont != 1);
    }
}
