package com.company.oop.incapsulation;

import java.nio.channels.SelectableChannel;

public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlock(Block ob){
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        }else return false;
    }
    boolean sameVolume(Block ob){
        if (ob.volume == volume) {
            return true;
        }else return false;
    }
}
