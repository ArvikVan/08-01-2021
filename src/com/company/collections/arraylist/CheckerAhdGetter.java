package com.company.collections.arraylist;
// 1. Проверить список и получить первый элемент.

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        return list.get(0);
    }
}
