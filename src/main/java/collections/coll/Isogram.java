package com.company.collections.coll;

import java.util.HashSet;

// 6. Изограмма
public class Isogram {
    public static boolean checkString(String s) {
        String[] strings = s.split("");
        HashSet<String> hashSet = new HashSet<>();
        for (String str : strings) {
            hashSet.add(str);
        }
        return strings.length == hashSet.size();
    }
}
