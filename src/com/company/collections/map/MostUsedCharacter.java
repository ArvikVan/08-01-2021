package com.company.collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// 7. Найти символ который используется в строке наибольшее количество раз
//нижний регистр
//убираем пробелы
// кладем в массив характеров
//помещаем в мапу
public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String low = str.toLowerCase();
        String withoutSpace = low.replace(" ", "");
        char[] chars = withoutSpace.toString().toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (Character character: chars) {
            treeMap.computeIfPresent(character, (a, b) -> b + 1);
            treeMap.putIfAbsent(character, 1);
        }
        int max = 0;
        for (Character s : treeMap.keySet()) {
            if (treeMap.get(s) > max) {
                max = treeMap.get(s);
                rsl = s;
            }
        }

        return rsl;
    }
}
