package com.company.sort;
/**
 * класс который описывает сравнение
 * @author Arviy
 * @version 1.0
 */

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {
    public static class User implements Comparable<User> {
        /**
         * класс имеет два поля
         */
        private String name;
        private int age;

        /**
         * конструктор с двумя полями
         * @param name поле имя
         * @param age поле возраст
         */
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * гетттер для доступа к приватному полю имя
         * @return возвращает имя
         */
        public String getName() {
            return name;
        }

        /**
         * геттер для достпуа к приватному полю возраст
         * @return возвразает возраст
         */
        public int getAge() {
            return age;
        }

        /**
         * для реализаций своих моделей данных эти методы необходимо переопределять
         * для их корректной работы
         * @param o
         * @return
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return Objects.equals(name, user.name) && Objects.equals(age, user.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        /**
         * компаратор thenComparing()
         * @return возвращает значение  сравнения возрастание по имени, убывание по возрасту
         */
        public static Comparator<User> thenComparing() {
            return ascByName().thenComparing(descByAge());
        }

        /**
         * метод описывает возрастание по имени, натурал ордер
         * @return возвращает польователей по возрастанию
         */
        public static Comparator<User> ascByName() {
            return Comparator.naturalOrder();
        }

        /**
         * метод описывает убывание по имени reversOrder
         * @return возщвращает сортировку по убыванию
         */
        public static Comparator<User> descByAge() {
            return Comparator.reverseOrder();
        }

        /**
         * сортировка
         * @param user поле принимает
         * @return возвращает обычную сортировку по имени
         */
        @Override
        public int compareTo(User user) {
            return name.compareTo(user.name);
        }
    }
}
