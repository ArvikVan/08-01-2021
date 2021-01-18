package com.company.bases.conditions;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");
        int num = scanner.nextInt();

        if (num == 2 || num == 9){
            System.out.println(" The number is 2 or 9");
        }else System.out.println("Unknown number");
    }
}
