package com.company.oop.legasy;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Thomas");
        tom.dispaly();
        Employe sam = new Employe("Samuel", "Winchester&Br");
        sam.dispaly();
        sam.work();
    }
}
