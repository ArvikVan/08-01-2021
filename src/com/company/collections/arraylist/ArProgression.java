package com.company.collections.arraylist;
// 14. Арифметическая прогрессия
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = 0;
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                return 0;
            }

        } for (Integer sum : data) {
            rsl = rsl + sum;
        }
        return rsl;
    }
}
