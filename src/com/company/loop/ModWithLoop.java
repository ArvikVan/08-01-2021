package com.company.loop;
//Есть операция остаток от деления %. Вам даны два целых положительных числа числа n и d (d > 0).
//n это делимое, d это делитель. Вам нужно не используя операцию %, найти остаток от деления.
public class ModWithLoop {
    public static int mod(int n, int d) {
        while ( n >= d) {
            n = n - d;
            //System.out.println(delimoe);

        }
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        ModWithLoop.mod(8, 3);
       ModWithLoop.mod(4, 2);
       ModWithLoop.mod(3, 2);
        ModWithLoop.mod(8, 3);
        ModWithLoop.mod(0, 3);
       /* ModWithLoop.mod(9, 4);*/


    }
}
