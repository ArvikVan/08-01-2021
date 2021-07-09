package io.file;
/**
 * класс описывает чтение самого себя (байтов) посредством методов avaible() skip()
 * @author arvik
 * @version 1.0
 */

import java.io.FileInputStream;

public class FileInputStreamDeamo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("src/main/java/io/file/FileInputStreamDeamo.java");) {
            size = f.available();
            System.out.println("Общее колво доступных байтов" + size);
            int n = size / 40;
            System.out.println("Первые " + n + " байтов" + " прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\n Все еще доступно: " + f.available());
            System.out.println("Чтение следущих " + n + " байтов методом read(b[])");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + " байтов");
            }
            System.out.println(new String(b, 0, n));

            System.out.println("\n Все еще доступно: " + size);
            System.out.println("Пропукскаем половину оставшихся байтов методом skip()");

            f.skip(size / 2);
            System.out.println("Все еще доступно: " + f.available());
            System.out.println("Чтение " + n / 2 + " байтов, размещаемых в конце");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Нельзя прочитать " + n / 2 + " байтов");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно: " + f.available());
        } catch (Exception e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
