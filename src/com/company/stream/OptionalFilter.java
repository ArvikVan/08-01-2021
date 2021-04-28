package com.company.stream;
/**
 * Известно, что работникам организации, у которых > 2 детей положены льготы для детей.
 * Но не всем детям, а тем, что младше 15. Некоторые работники не знают подробности акции.
 * Они решили придти в отдел организации, который отвечает за льготы и узнать положены ли
 * льготы их детям, если да, то каким именно. Вам дан список и работников и паспорт
 * интересующего работника. Нужно найти список детей этого работника, которым положены льготы.
 * В системе уже есть метод поиска по паспорту, вам нужно используя этот метод дописать метод поиска детей
 * @author arviy
 * @version 1.0
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFilter {
    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        return findByPassport(workers, passport).stream() //берем рабочего, открываем поток
                .filter(x -> x.getChildren().size() > 2) // оставляем только тех у кого больше 2
                .flatMap(x -> x.getChildren().stream()) //открываем поток с тем кто остался
                .filter(x -> x.getAge() < 15) // оставляем только тех у кого детям меньше 15
                .collect(Collectors.toList());

    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }
}
