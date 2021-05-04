package com.company.collections.arraylist;
// 4. Найти индекс элемента
import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        if (!list.contains(str)) {
            return false;
        }
        return list.indexOf(str) == list.lastIndexOf(str);

    }
}
