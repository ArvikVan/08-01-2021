package com.company.collections.map;
// 8. Объединение значений в Map.
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User user: users) {
            //сначала добавить пользователя - ключ id, значение - имя пользователя
            names.putIfAbsent(user.getId(), user.getName());
            //необходимо к имени добавить фамилию
            names.merge(user.getId(), user.getSurname(), (oldU, newU) -> oldU + " " +  newU);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
