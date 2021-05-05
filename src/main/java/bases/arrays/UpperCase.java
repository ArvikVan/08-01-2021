package com.company.bases.arrays;
//27. Привести строку к верхнему регистру
public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            Character.toUpperCase(string[i]);
            char temp = string[i];
            Character.toUpperCase(temp);
            System.out.print(Character.toUpperCase(string[i]));
            string[i] = Character.toUpperCase(temp); // самое главное

        }
        return string;
    }

}
