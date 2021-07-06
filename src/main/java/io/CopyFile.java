package io;
/**
 * класс описывает копирование фала firstCopyFile в secondCopyFile
 * копируется содержимое
 * @author arvik
 * @version 1.0
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //проверяем что указали оба имени
        if (args.length != 2) {
            System.out.println("Испольщование CopyFile in out");
            return;
        }
        //copyfile
        try {
            //openfile
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка ввода - вывода" + e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e2) {
                System.out.println("ошибка закрытия файла ввода ");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла вывода ");
            }
        }
    }
}
