package com.company.oop.legasy.interfaces;

public class Niva implements Car{
    private static int gear = 10;
    private static int doors = 10;
    private static int trunk = 10;
    @Override
    public void breaks() {
        System.out.println("Niva public void breaks()");
        System.out.println("Niva.gear = " + Niva.gear);
        System.out.println("Car.gear = " + Car.gear);
    }

    @Override
    public void gas() {
        System.out.println("Niva public void gas()");
        System.out.println("Niva.doors = " + Niva.doors);
        System.out.println("Car.doors = " + Car.doors);
    }

    @Override
    public void parking() {
        System.out.println("Niva public void parking()");
        System.out.println("Niva.trunk = "+ Niva.trunk);
        System.out.println("Car.trunk = "+ Car.trunk);
    }
}
