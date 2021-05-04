package com.company.bases;

public class SymbolsTypes {
    public static void main(String[] args) {
        char a = 102;
        System.out.println(a);
        char a2 = '\u0066'; //16-ричная форма записи
        System.out.println(a2);

        String s = "Hello";
        String s2 = "Hello\nWoooorld"; // \n каретка переводящая на друггую строку
        System.out.println(s);
        System.out.println(s2);
        String s3 = "Вставай, проклятьем заклейменый, \n"
                + "весь мир, голодных и рабов"; // в java15 появилась возможность многострочного текста
        System.out.println(s3);
    }
}
