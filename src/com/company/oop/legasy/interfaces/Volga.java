package com.company.oop.legasy.interfaces;

public class Volga implements Car{
    @Override
    public void breaks() {
        System.out.println("public void breaks()");
        System.out.println("Переменные взяты из интерфеса Car");
        System.out.println(ralls + " " + doors + " " + lights + " " + trunk + " " + gear);
    }

    @Override
    public void gas() {
        System.out.println("public void gas()");
    }

    @Override
    public void parking() {
        System.out.println("public void parking()");
    }
}
