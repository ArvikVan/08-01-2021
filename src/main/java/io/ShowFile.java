package io;
/**
 * класс описывает чтение из файла
 * @author arvik
 * @vrrsion 1.0
 * использование try with resourses
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        //проверяем что указали имя
        if (args.length != 1) {
            System.out.println("Использование : ShowFile имя_файла");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода/вывода");
        }
    }
}
