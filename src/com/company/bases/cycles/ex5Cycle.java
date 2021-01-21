package com.company.bases.cycles;

public class ex5Cycle {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
