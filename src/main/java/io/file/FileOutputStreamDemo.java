package io.file;
/**
 * класс описывает работу класса FilOutputStream
 * @author arvik
 * @version 1.0
 * Создаем источник текста
 * Помещаем в массив байтов
 * создаем объекты класса
 * и оборачивая в трай создаем три файла
 * записываем данные которые надо в файлы, в нашем случае
 */

import javax.security.auth.login.AccountLockedException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Some source text for dividing by bytes";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("src/main/java/io/file/file0.txt");
            f1 = new FileOutputStream("src/main/java/io/file/file1.txt");
            f2 = new FileOutputStream("src/main/java/io/file/file2.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            try {
                if (f0 != null) {
                    f0.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file0.txt");
            }
            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file1.txt");
            }
            try {
                if (f2 != null) {
                    f2.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file2.txt");
            }
        }
    }
}
