package com.company.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = Integer.toString(i);

        for (int j = 0; j < s.length()/2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
