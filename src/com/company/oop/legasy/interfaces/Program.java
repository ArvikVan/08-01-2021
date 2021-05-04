package com.company.oop.legasy.interfaces;

public class Program {
    public static void main(String[] args) {
        Car volga = new Volga();
        volga.breaks();
        volga.parking();
        volga.gas();
        Car niva = new Volga();
        niva.breaks();
        niva.gas();
        niva.parking();
    }
}