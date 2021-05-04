package com.company;

public class Max {
    public static void main(String[] args) {
        int a = 60;
        int b = 58;
        int c = 59;
        if (a > b) {
            if (a > c) {
                System.out.println("a maximum");
            } else {
                System.out.println("c maximum");
            }
        } else if (b > c) {
            System.out.println("b maximum");
        } else {
            System.out.println("c maximum");
        }
    }
}
