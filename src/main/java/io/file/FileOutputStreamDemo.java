package io.file;
/**
 * класс описывает работу класса FilOutputStream
 * @author arvik
 * @version 1.1
 * Создаем источник текста
 * Помещаем в массив байтов
 * создаем объекты класса
 * и оборачивая в трай создаем три файла
 * записываем данные которые надо в файлы, в нашем случае
 * 1.1 try with resourses
 */

import javax.security.auth.login.AccountLockedException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Some source text for dividing by bytes";
        byte[] buf = source.getBytes();

        try (FileOutputStream f0 = new FileOutputStream("src/main/java/io/file/file0.txt");
             FileOutputStream f1 = new FileOutputStream("src/main/java/io/file/file1.txt");
             FileOutputStream f2 = new FileOutputStream("src/main/java/io/file/file2.txt");) {

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
