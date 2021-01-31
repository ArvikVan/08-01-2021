package com.company.oop.incapsulation.argum;

public class NewTest {
    int a, b;

    public NewTest(int i, int j) {
        this.a = i;
        this.b = j;
    }
    void change(NewTest ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
