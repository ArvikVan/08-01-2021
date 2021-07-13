package io.symbols;

import java.io.Console;
/**
 * класс описывает работу Console
 * @author arvik
 * @version 1.0
 * код не работает в ide, запускать только с КОНСОЛИ
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console(); // получаем ссылку на консоль

        if (con != null) { //выходим из программы, если консоль недоступна
            str = con.readLine("Введите строку: ");
            con.printf("Введенная вами строка: %s\n", str);
        }
    }
}
