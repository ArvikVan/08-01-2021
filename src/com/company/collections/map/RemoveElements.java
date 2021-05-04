package com.company.collections.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
// 9. Удаление пар ключ-значение из отображения
public class RemoveElements {
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        for (Integer idToDelete: ids) {
            data.remove(idToDelete);
        }
        for (User userToDelete : users) {
            data.remove(userToDelete.getId());
        }
        return data;
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
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
