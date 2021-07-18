package nio;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * класс описывает чтение данных из файла
 * @author arvik
 * @version 1.0
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        //получаем доступ к файлу в канале, именно доступ, файл дожен быть создан заранее
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("src/main/java/nio/MCRtest.txt"))) {
            //получаем размер файла
            long fSize = fChan.size();

            //сопоставляем файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
