package com.company.bases.conditions;

import java.util.Scanner;

public class ResCond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        int num1 = scanner.nextInt();

        System.out.println("Input the second number");
        int num2 = scanner.nextInt();

        if(num1 < num2){
            System.out.println("num1 < num2");
        }else if (num1 > num2){
            System.out.println("num1 > num2");
        }else System.out.println("num1 = num2");
    }
}
