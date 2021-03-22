package com.company.collections.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pangram {
    public static boolean checkString(String s) {
        String[] strings = s.split("");
        List<String> list = new ArrayList<>();
        for (String str : strings) {
            list.add(str);
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        hashSet.remove(" ");
        if (hashSet.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}
