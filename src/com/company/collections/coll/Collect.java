package com.company.collections.coll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Collect {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("Test.txt"); //загружаем данные из файла в память
        int length = stream.available(); //узнаем длину файла с помощью команды .available()
        byte[] data = new byte[length]; //создаем байтовый массив нужной длины length
        stream.read(data); //читаем массив в память

        String text = new String(data); //преобразовываем байты в текст
        System.out.println(text);
        ArrayList<String[]> lineWords = new ArrayList<>();

        //дальше нужно текст разбить на строки
        String[] lines = text.split("\n");
        for (String line : lines) {
            System.out.println(line);
            System.out.println("------\n");
            //далее нужно разделить строки на слова
            String[] words = line.split(","); //при изменении на  line.split("|") получается жопа
            lineWords.add(words);
        }
        for (String[] words : lineWords) {
            for (String word : words) {
                System.out.print(word);
                System.out.print("|");
            }
            System.out.println("\n--------------------------");
        }
    }
}
