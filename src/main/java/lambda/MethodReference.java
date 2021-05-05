package com.company.lambda;
/**
 * класс описывает работу лямбды как ссылки на метод
 * @author arviy
 * #version 1.0
 */

import java.util.function.Consumer;

public class MethodReference {
    /**
     * К не статическим методам можно получить доступ как через объект класса, например, this::print
     */
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    /**
     * К статическим методам можно получить доступ через имя класса
     */
    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    public void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
