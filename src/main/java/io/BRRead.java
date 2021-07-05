package io;
/**
 * класс описывает простой ввод и чтение символов с консоли
 * шилдт стр 360 глава 13
 * @author arvik
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input some symbol: ");
        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');
    }
}
