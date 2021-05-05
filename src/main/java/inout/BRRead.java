package com.company.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input some symbols, 'q' for out from console");
        do {
            c = (char) br.read();
            //read() передача символов программе происходит после нажатия клавиши Enter
            //Input some symbols, 'q' for out from console
            //trwerq
            //t r w e r q
            //Process finished with exit code 0
            System.out.print(c + " ");
        } while (c != 'q');
    }
}
