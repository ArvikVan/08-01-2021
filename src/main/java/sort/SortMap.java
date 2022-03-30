package sort;
/**
 * класс описывает "сортировку" мапы с использование компаратора
 * @author Arviy
 * @version 1.0
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    /**
     * метод описывает создание новой сортированной мапы из исходной
     * @param map на вход принимаеется мапа которую надо сортировать
     * @return возвращается другая - сортированная мапа на основе старой
     */
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        return result;
    }
}
