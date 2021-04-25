package com.company.stream;
/**
 * Collectors.averagingDouble() подсчитывает среднее значения элементов в группе.
 * В качестве аргумента принимает функция, в которой мы должны указать как преобразовать элемент в double.
 * Ваша задача найти для каждой компании средний возраст сотрудников.
 * 1 получить струдников компании getCompany, getName
 * 2 средний возраст WorkersgetAge
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragingMethod {
    public static class Company {

        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {

        private int age;

        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        x -> x.getCompany().getName(),//находим сотрудников
                        Collectors.averagingDouble(Worker::getAge)//средний возраст
                ));
    }


}
