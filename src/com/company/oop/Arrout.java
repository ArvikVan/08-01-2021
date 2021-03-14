package com.company.oop;


import java.util.Arrays;

public class Arrout {
    public static void main(String[] args) {
        User[] user = {
                new User("first", true),
                new User("second", true),
                new User("third", true)

        };
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].getUserName());
        }
    }
}
