package com.company.oop.incapsulation;

public class Block {
    int a; int b; int c;
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
