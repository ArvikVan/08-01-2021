package io.symbols;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * класс описывает работу CharArrayWriter который использует массив в качестве адресата для ВЫВОДИМЫХ данных
 * @author arvik
 * @version 1.0
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = " Эти данные должны быть введены в массив ";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println(" Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nВ поток вывода типа FileWriter()");
        try (FileWriter f2 = new FileWriter("src/main/java/io/symbols/test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода- вывода " + e);
            f.reset();
        }

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
