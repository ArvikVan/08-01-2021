package com.company.oop.classObj;

class InitiPerson {
    String name;
    int age;

    {
        name = "Winchester";
        age = 333;
    }
    InitiPerson(){//пустой конструктор обязателен, чтоб в вызываемом класе можно было не заполнять поля
        //и оставить там значение по умолчанию, определенные выше в фигурных скобках

    }
    InitiPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    InitiPerson(String name) {
        this.name = name;
    }
    void InitiWalk(){
        System.out.printf("Метод void InitiWalk() Name : %s  и Age : %d", name, age);
        System.out.println();
    }
}
