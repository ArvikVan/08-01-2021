package com.company.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Input the lines of text. ");
        System.out.println("Input 'stop' for exit program ");

        do {
            str = br.readLine(); //Выводит строки
            System.out.println(str + " ");
        } while (!str.equals("stop"));
    }
}
//Input the lines of text.
//Input 'stop' for exit program
//exit
//exit
//stop
//stop
//
//Process finished with exit code 0
