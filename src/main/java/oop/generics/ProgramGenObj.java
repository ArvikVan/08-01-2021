package oop.generics;

public class ProgramGenObj {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Tom", "Sam", "Jack", "Marvin", "Klark", "John"};
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};

        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
