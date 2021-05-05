package com.company.oop.incapsulation.argum;

public class CallByRef {
    public static void main(String[] args) {
        NewTest newTest = new NewTest(15, 20);
        System.out.println("newTest.a и newTest.b перед вызовом: " + newTest.a + " " + newTest.b);

        newTest.change(newTest);
        System.out.println("newTest.a и newTest.b после вызова: " + newTest.a + " " + newTest.b);
    }
}
