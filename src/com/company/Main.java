package com.company;
//с потерей         без потери
//1 выражение       3выражение
//2 выражение       5 выражение
//4выражение
public class Main {

    public static void main(String[] args) {
        //1выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println(l);
        System.out.println(b);
        //2выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);
        //3выражение
        char c = 45000;
        float fl = c;
        System.out.println(fl);
        //4выражение
        double d = 121.19;
        byte b1 = (byte) d;
        System.out.println(b1);
        //5 выражение
        short s = 1500;
        char c1 = (char) s;
        double d1 = c1;
        System.out.println(d1);
    }
}
