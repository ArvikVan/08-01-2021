package com.company.loop;
//Нужно вывести числа от M до N. N не включено. M > N.
public class BackwardFor {
    public static void out(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BackwardFor.out(10, 0);
    }
}
