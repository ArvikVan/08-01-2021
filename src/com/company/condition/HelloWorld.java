package com.company.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String result = "";
        if (number % 3 == 0) {
            if ((number % 3) == 0 && (number % 5) == 0) {
                result = "Hello, World!!!";
            }
            else {
                result = "Hello";
            }
        } else {
            if (number % 5 == 0) {
                result = "World";
            } else {
                result = "Operation not support";
            }
        }
            return result;
    }
}
