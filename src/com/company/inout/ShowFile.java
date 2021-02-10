package com.company.inout;

import com.company.oop.incapsulation.argum.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        //проверяем имя файла
        if (args.length != 1){
            System.out.println("Использование: ShowFile Test.ods");
            return;
        }
        //попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл ");
            return;
        }//файл открыт и готов к чтению
        //читаем символы, пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != 1 ) System.out.println((char) i);
            }while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла ");
        }
        //закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }

    }
}
