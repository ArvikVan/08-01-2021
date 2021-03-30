package com.company.collections.map;

import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        /*for (Integer i : hashMap.keySet()) {
            System.out.println(i + " " + hashMap.get(i));
        }*/

    }
}
