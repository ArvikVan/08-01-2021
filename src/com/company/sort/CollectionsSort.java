package com.company.sort;
/**
 * Класс описывает сортировку по возрастанию Метод Collections.sort()
 * @author Arviy
 * @version 1.0
 */

import java.util.Collections;
import java.util.List;

public class CollectionsSort {
    /**
     * метод описывает сорт
     * @param data принимает лист, который необходимо отсортировать
     * @return возвращщает сортированный список
     */
    public static List<String> sort(List<String> data) {
        Collections.sort(data);
        return data;
    }
}
