package com.company.bases.conditions;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your deposit amount");
        Double deposit = scanner.nextDouble();

        if (deposit < 100) {
            System.out.println("Your deposit amount 5%");
            deposit = deposit + deposit * 0.05;
        } else if (deposit > 101 && deposit < 200) {
            System.out.println("Your deposit amount 7%");
            deposit = deposit + deposit * 0.07;
        } else if (deposit > 201) {
            System.out.println("Your deposit amount 10");
            deposit = deposit + deposit * 0.1;
        }
        System.out.println("Your deposit plus % : " + deposit);
    }
}
