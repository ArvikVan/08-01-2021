package io.file;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * класс описывает работу потока ввода, использующий массив байтов в качестве адресата
 * @author arvik
 * @version 1.0
 * создаем объект типа
 * создаем источник который надо в массив передать
 * созадем массив и передаем в него источник в виде байтов
 * записываем в буфер
 * выводим в консоль в виде строки
 * создаем массив байтов и передаем в него строку
 * выводим в виде символов
 * выводим в файл
 */
public class ByteArrayOutputSreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This data must be input to array";
        byte[] buf = s.getBytes();

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nВ поток вывода типа OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream("src/main/java/io/file/test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
            return;
        }
        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
