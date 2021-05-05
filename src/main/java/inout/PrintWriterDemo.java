package com.company.inout;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true); // поток ввода
        pw.println("This is a String ");
        int i = -845;
        pw.println(i);
        double d = 5.556;
        pw.println(d);

    }
}
