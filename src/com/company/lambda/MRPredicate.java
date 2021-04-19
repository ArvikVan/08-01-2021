package com.company.lambda;
/**
 * класс описывает предикат который проверяет что строка пустая
 * @author arviy
 * @version 1.0
 */

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
