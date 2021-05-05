package com.company.oop.incapsulation;

public class OLMPProgram {
    public static void main(String[] args) {
        ObjLikeMethodsParam kate = new ObjLikeMethodsParam("Kate");
        System.out.println(kate.getName()); //"Kate"
        changeName(kate); //"changeName"
        System.out.println(kate.getName());
        }

        static void changeName(ObjLikeMethodsParam oLMP) { //тут передали объект в метод как параметр
            oLMP.setName("changeName");
        }
    }

