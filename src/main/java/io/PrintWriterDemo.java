package io;
/**
 * класс описывает применение клааса PrintWriter для управления вывода данных на консоль
 * @author arvik
 * @version 1.0
 */

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is a string");
        int i = 7;
        pw.println(i);
        double d = 21.555;
        pw.println(d);
    }
}
