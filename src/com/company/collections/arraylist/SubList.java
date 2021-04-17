package com.company.collections.arraylist;
//9. Получить часть списка с определенными индексами
//List<E> subList(int fromIndex, int toIndex) - метод возвращает список, который содержит
// все элементы исходного списка начиная с индекса fromIndex(включительно) и до toIndex(значение исключается).
// При этом, если выполняется условие fromIndex == toIndex,- метод вернет пустой список.

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(el)) {
                count++;
            }
        }
        if (!list.contains(el) && count <= 1) {
            return list.subList(0,0);
        } else {
            return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
    }
}
