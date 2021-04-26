package com.company.stream;
/**
 * Метод filter() используется чаще всего.
 * Нужен он чтобы оставить в стриме только объекты, которые удовлетворяют условию
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
}
