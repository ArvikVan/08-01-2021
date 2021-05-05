package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("FirstStudentName", 'M', 25, 1, 1.1);
        Student st2 = new Student("SecondStudentName", 'M', 26, 1, 1.2);
        Student st3 = new Student("ThirdStudentName", 'M', 27, 1, 1.3);
        Student st4 = new Student("ForthStudentName", 'M', 28, 1, 1.4);
        Student st5 = new Student("FifthStudentName", 'M', 29, 1, 1.5);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        for (Student st:studentList) {
            System.out.println(st);
        }
        int studentIndex = studentList.indexOf(st2); //метод показывающий индекс
        System.out.println(studentIndex);
        System.out.println(studentList.contains(st2));
        //метод .toArray Перевод ArrayList  в обычный массив
        Student[] stArr = studentList.toArray(new Student[0]);
        System.out.println(Arrays.toString(stArr));
    }
}
