package nio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * класс описывает потоковый вывод/запись в файл на основе NIO
 * @author arvik
 * @version 1.0
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        //открываем файл и получаем связанный с ним поток
        try (OutputStream outputStream = new BufferedOutputStream(
                Files.newOutputStream(Paths.get("src/main/java/nio/MCRtestCreate.txt"))
        )) {
            //выводим в поток заданное кол-ва байтов
            for (int i = 0; i < 26; i++) {
                outputStream.write((byte) 'A' + i);
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        }
    }
}
