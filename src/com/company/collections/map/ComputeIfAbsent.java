package com.company.collections.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

// 6. Вычисление значений в отображении если ключа не существует
public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User user: users) {
            names.computeIfPresent(user.getId(), (key, value) -> user.getName());
            names.computeIfAbsent(user.getId(), key -> user.getName());
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
