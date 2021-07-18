package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * класс описывает запись данных в файл
 * @author arvik
 * @version 1.0
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        //получаем канал к файлу, создаем если такого файла нет
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("src/main/java/nio/MCRtestCreate.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {
                //создаем буфер
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            //запишем некоторое количество байт в буфер
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }
            //полготовим буфер к записи Прежде чем данные будут записаны в файл, для буфера следует вызвать
            //метод rewind ( ) , чтобы обнулить его текущую позицию. ( Каждая операция вывода
            // в буфер увеличивает его текущую позицию. Поэтому перед записью в файл ее
            //следует возвратить в исходное положение.)
            mBuf.rewind();
            //запишем данные из буфера в файл
            fChan.write(mBuf);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
            System.exit(1);
        }
    }
}
