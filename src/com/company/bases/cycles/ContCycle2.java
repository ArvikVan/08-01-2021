package com.company.bases.cycles;

public class ContCycle2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; //при получении 5, программа проскает ее и продолжает цикл
            }
            System.out.println("i = " + i);
        }
    }
}
