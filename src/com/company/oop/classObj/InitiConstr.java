package com.company.oop.classObj;

public class InitiConstr {
    public static void main(String[] args) {
        InitiPerson bob = new InitiPerson("Bob");
        bob.InitiWalk();
        InitiPerson sam = new InitiPerson("Sam", 55);
        sam.InitiWalk();
        InitiPerson dean = new InitiPerson();
        dean.InitiWalk();
    }
}
