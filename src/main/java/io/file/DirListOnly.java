package io.file;
/**
 * класс должен) описывать работу list() при выводе каталога с фильтром
 * @author arvik
 * @version 1.0
 */

import java.io.File;
import java.io.FilenameFilter;

/**
 * создаем стрингу в которой укажем откуда начинать католог
 * создаем объект типа File и указываем этот католог
 * указываем что именно надо оставить из каталога
 * Каталог в джава интерпретируется как объект класса File со списком имен файлов
 * создаем массив строк и пихаем туда этот каталог методом list() с соответствующим фильтром
 * циклом выводим что получили
 *
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "./";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");

        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
