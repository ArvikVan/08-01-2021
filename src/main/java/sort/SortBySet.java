package com.company.sort;
/**
 * класс описывает сортировку с использованием новой коллекции
 * @author Arviy
 * @version 1.0
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySet {
    /**
     * метод описывает сортировку созданием нового трисета
     * @param list принимает на вход список
     * @return возвращает сортированный трисет
     */
    public static Set<String> sort(List<String> list) {
        return new TreeSet<>(list);
    }
}
