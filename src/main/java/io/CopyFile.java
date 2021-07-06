package io;
/**
 * класс описывает копирование фала firstCopyFile в secondCopyFile
 * копируется содержимое
 * @author arvik
 * @version 1.1
 * используем try with resourses
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        //проверяем что указали оба имени
        if (args.length != 2) {
            System.out.println("Испольщование CopyFile in out");
            return;
        }
        //copyfile
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            //openfile
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка ввода - вывода" + e);
        }
    }
}
