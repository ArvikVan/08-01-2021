package com.company.collections.map;
    //11. Реализовать словарь.
//В данном задании необходимо реализовать словарь.
//Метод принимает массив строк.
//Необходимо перебрать массив и добавить строки в карту таким образом,
// чтобы ключом был первый символ строки, а значением - список строк, которые начинаются на первый символ строки.
import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String stringToMap : strings) {
            char charForMap = stringToMap.charAt(0);
            String myFirstStrChar = String.valueOf(charForMap);
            List<String> list = new ArrayList<>();
            for (String lstr: strings) {
                if (lstr.startsWith(myFirstStrChar)) {
                    list.add(lstr);
                }
            }
            rsl.put(myFirstStrChar, list);
        }
        return rsl;
    }
}
