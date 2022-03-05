package oop.generics;

public class Program2G {
    public static void main(String[] args) {
        Account2G acc1 = new Account2G(12, 5654788);
        Account2G acc2 = new Account2G("sdfsf", 5552);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
