package com.company.bases;

public class IntTypes {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        long c = 52;// все целые числа по умолчанию имеют тип int
        long d = 2147483649l; //в данном случае перебор и посему добавляется L в конце
        int num1 = 0x16F;//16ричная система
        int num2 = 010;//8ричная
        int num3 = 0b1101;//2ичная
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        //имеется поддержка нижнего подчеркивания
        int x = 1232_5254;
        int y = 234_567_89;
        System.out.println(x + " " + y);
    }
}
