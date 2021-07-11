package io;
/**
 * класс описывает работу DataInput/OutputStream
 * запись/чтение данных в/из файл
 * @author arvik
 * @version 1.0
 */

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        //записываем данные в файл
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/main/java/io/DataTest.txt"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода - вывода " + e);
        }
        //читаем данные из файла
        try (DataInputStream din = new DataInputStream(new FileInputStream("src/main/java/io/DataTest.txt"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Полученные данные " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Нальзя открытьфайл ввода");
            return;
        } catch (IOException e) {
            System.out.println("Ощибка ввода - вывода");
        }
    }
}
