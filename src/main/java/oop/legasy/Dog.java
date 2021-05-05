package com.company.oop.legasy;

public abstract class Dog {
    String breed;

    public void bark() {
        System.out.println("public abstract class Dog and his method public void bark()");
    }

    public abstract void poop(); //абстрактный метод пустой и обязательный к исполнению
                                // в классах которые унаследовали  этот класс
}
