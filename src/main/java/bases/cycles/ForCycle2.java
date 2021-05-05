package com.company.bases.cycles;

public class ForCycle2 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0, j = n - 1; i < j;) {
            System.out.print("i :" + i);
            System.out.print(", j :" + j);
            System.out.println(" Умножение i на j : " + i * j);
            i++; j--; //счетчик срабатывает в конце цикла, должно быть
        }
    }
}
