package io;
/**
 * класс описывает ввод и чтение строк
 * @author arvik
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //создаем поток ввода типа BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Input string lines: ");
        System.out.println("Input 'stop' to stop.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
