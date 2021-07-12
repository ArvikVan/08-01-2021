package io.symbols;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * класс описывает работу CharArrayReader который принимает массив символов в качестве источника данных
 * @author arvik
 * @version 1.0
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];
        //важно: индекс первого символа в строке для копирования
        //       индекс после последнего символа в строке для копирования
        //       массив куда пойдут эти копии
        //       индекс массива с которого начнется смещение/добавление после вставки
        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1: ");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("input2:");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода -вывода " + e);
        }
    }
}
