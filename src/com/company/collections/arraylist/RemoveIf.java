package com.company.collections.arraylist;
// 10. Удаление элементов по условию
import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(n -> n.length() < 5);
        return list;
    }
}
