package io;
/**
 * класс описывает ввод и чтение с консоли массива строк
 * запись  в массив и чтение из него
 * @autor arvik
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //создаем массив куда все будем класть
        String[] str = new String[100];
        System.out.println("Input some strings: ");
        System.out.println("Enter 'stop' to exit");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("\nYour sinput strings: ");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
