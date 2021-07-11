package io.symbols;
/**
 * класс описывает чтение и вывод файла
 * @author arvik
 * @version 1.0
 */

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("Test.txt")) {
            int c;
            //читаем и выводм содержимое файла
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода- вывода " + e);
        }
    }
}
