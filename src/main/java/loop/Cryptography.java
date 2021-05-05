package com.company.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.equals("")) {
            return "empty";
        } else if ((s.length() < 4) && (s.length() > 0)) {
            return s;
        } else if (s.length() > 4) {
            StringBuilder str = new StringBuilder(s);
            for (int i = 0; i < str.length() - 4; i++) {
                str.setCharAt(i, '#');
                s = str.toString();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Cryptography.code("12334534");
        Cryptography.code("");
        Cryptography.code("1234");
    }
}
