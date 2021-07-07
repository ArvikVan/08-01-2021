package io.file;
/**
 * Класс описывает работу класса File  и его методов
 * @author arvik
 * @version 1.0
 */

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("src/main/java/io/file/COPYRIGHT");
        p("FileName: " + f1.getName());
        p("The path is: " + f1.getPath());
        p("The absolute path is: " + f1.getAbsolutePath());
        p("The parent catalogue: " + f1.getParent());
        p(f1.exists() ? "exist" : "notExist");
        p("The last refactoring: " + f1.lastModified());
        p("The size is: " + f1.length());

    }
}
