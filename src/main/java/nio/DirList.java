package nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * класс описывает вывод сожержимого каталога
 * @author arvik
 * @version 1.0
 * содаем стрингу в которой будет адрес каталога
 * получаем и обрабатываем поток ввода каталога try with resourses
 * указываем на то в каком каталоге находимся
 * выводим содержимое каталога циклом, т.к. DyrectoreStream реализует интерфейс Iterable
 * в параметрах метода getName указываем индекс того каталога который надо показать
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "src/main/java/nio";
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Каталог в котором находимся: " + dirname);
            for (Path path : directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
                if (attributes.isDirectory()) {
                    System.out.println("<DIR>");
                } else {
                    System.out.println("   ");
                }
                System.out.println(path.getName(4));
            }

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
