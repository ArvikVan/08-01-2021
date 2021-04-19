package com.company.lambda;
/**
 * метод поиска строки среди списка строк. Если значение найдено,
 * то нужно вернуть Optional из этого значения, в противном случае вернуть пустой Optional.
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
       if (strings.contains(value)) {
           return Optional.of(value);
       } return Optional.empty();
       //return strings.contains(value) ? Optional.of(value) : Optional.empty();
    }
}
