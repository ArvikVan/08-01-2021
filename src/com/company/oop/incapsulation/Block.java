package com.company.oop.incapsulation;

import java.nio.channels.SelectableChannel;

public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }

    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}
