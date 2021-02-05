package com.company.oop.legasy.interfaces;

public class Volga implements Car{
    private static int ralls = 10;
    @Override
    public void breaks() {
        System.out.println("Volga public void breaks()");
        System.out.println("Переменные взяты из интерфеса Car");
        System.out.println("Car.ralls = " + Car.ralls);
        System.out.println("Volga.ralls = " +Volga.ralls);
    }

    @Override
    public void gas() {
        System.out.println("Volga public void gas()");
    }

    @Override
    public void parking() {
        System.out.println("Volga public void parking()");
    }
}
