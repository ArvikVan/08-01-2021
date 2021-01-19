package com.company.bases.cycles;

public class ex1Cycle {
    public static void main(String[] args) {
        int popu = 1000000;
        int death = 8;
        int born = 14;
        int different = born - death;
        for (int i = 1; i <= 10; i++){
            popu = popu + (popu * different)/ 1000;
            System.out.println("Население в " + i + " год " + popu);
        }
        System.out.println("Население через 10 лет будет составлять: " + popu);
    }
}
