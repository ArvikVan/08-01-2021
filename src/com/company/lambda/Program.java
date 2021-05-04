package com.company.lambda;

import java.awt.*;

public class Program {
    public static void main(String[] args) {
        //() -> 123.45;
        //double myMeth() return 123.45;
        //(n) -> (n % 2) == 0; n%2==0 четные чиса ищет, но пока нихера не работает
        MyNumber myNum; //создается ссылка на функциональный интерфейс MyNumber(потому что в нем один абстр. метод)
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("myNum = () -> Math.random() * 100; = " + myNum.getValue());
        System.out.println("myNum = () -> Math.random() * 100; = " + myNum.getValue());

    }
}
