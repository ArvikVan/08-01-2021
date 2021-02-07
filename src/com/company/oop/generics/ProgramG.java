package com.company.oop.generics;

public class ProgramG {
    public static void main(String[] args) {
        AccountG<String> acc1 = new AccountG<String>("12345", 2587456);
        String acc1id = acc1.getId();
        System.out.println(acc1id);
    }
}
