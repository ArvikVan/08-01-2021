package com.company.oop.incapsulation.argum;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15;
        int b = 20;
        System.out.println("a и b перед вызовом " + a + " " + b);
        ob.noChange(2,3);/*Как видите, действия, выполняемые в теле метода noChange () , никоим образом не
        влияют на значения переменных а и Ь в вызывающем методе.*/
        System.out.println("a и b после вызвова " + a + " " + b);
    }
}
