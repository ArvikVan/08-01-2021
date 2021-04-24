package com.company.stream;
/**
 * Дан исходный список. Получить список БЕЗ элементов, кратных 4, из исходного списка.
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 4 != 0)
                .collect(Collectors.toList());
    }
}
