package com.company.condition;

public class Game {
    public static double checkGame(double percent, int prize, int pay) {
        double rsl = percent * prize - pay;
        if (percent * prize > pay)  return rsl;

            return 0;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(10, 5, 5));
    }
}
