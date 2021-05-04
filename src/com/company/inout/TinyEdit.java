package com.company.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//1. Создаем поток
//2. создаем массив обектов String для хранения строк которые будем вводить
//3. Вводим строки (цикл) пока не введм стоп
//4. выводим все что ввели (цикл)
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Input strings until 'stop'. ");

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("\n you put the following strings");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i] + " ");
        }
    }
}
