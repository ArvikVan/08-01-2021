package com.company.thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); //указываем ссылку на главный поток
        System.out.println("Текущий поток исполнения " + t);

        t.setName("My Thread"); //изменили имя потока
        System.out.println("После изменения имени потока " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
