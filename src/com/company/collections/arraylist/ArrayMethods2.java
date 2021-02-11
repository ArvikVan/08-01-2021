package com.company.collections.arraylist;

import java.util.ArrayList;

public class ArrayMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("FitStudent", 'M',25, 1, 1.1);
        Student st2 = new Student("SecondStudent", 'M', 26, 1, 1.2);
        Student st3 = new Student("ThirdStudent", 'M', 27, 1, 1.3);
        Student st4 = new Student("ForthStudent", 'M', 28, 1, 1.4);
        Student st5 = new Student("FifthStudent", 'M', 29, 1, 1.5);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
    }
}
