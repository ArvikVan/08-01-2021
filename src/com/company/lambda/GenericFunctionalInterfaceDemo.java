package com.company.lambda;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> revers = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0 ; i--) {
                result += str.charAt(i);
            }return result;
        };
        System.out.println(revers.func("Лямбда"));
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = i * result;
            }return result;
        };
        System.out.println(factorial.func(10));
    }
}
