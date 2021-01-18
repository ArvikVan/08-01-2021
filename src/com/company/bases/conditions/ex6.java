package com.company.bases.conditions;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите номер операции : 1. Сложение, 2. Вычитание, 3. Умножение");
        int op = scanner.nextInt();
        int res = 0;
        switch (op){
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            default:
                System.out.println("Операция не определенна");
                break;
        }
        System.out.println("Результат вычисления равен: " + res);
    }
}
