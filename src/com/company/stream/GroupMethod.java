package com.company.stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Класс Collectors содержит метод groupingBy(Function), его можно использовать для группировки,
 * по значению, которое возвращает Function. Данный метод вернет мапу с типом, которая возвращает
 * Function и значением списка по элементам стрима.
 * задача сгруппировать пользователей по возрасту
 * @author arvik
 * @version 1.0
 */
public class GroupMethod {
    public static class User {
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }

    public static Map<Integer, List<User>> groupBy(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

}
