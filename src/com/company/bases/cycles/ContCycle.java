package com.company.bases.cycles;

public class ContCycle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 5) break;// на цифре 5 break завершает цикл.
            System.out.println("i = " + i);
        }
    }
}
