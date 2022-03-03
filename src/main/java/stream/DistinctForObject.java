package stream;
/**
 * Если мы используем метод distinct() для объектов, то нужно понимать, что этот метод использует
 * метод equals для проверки равенства объектов. Поэтому если вы хотите исключить дубликаты-объекты,
 * нужно, чтобы в классе был переопределен метод equals
 */

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DistinctForObject {
    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
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
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static List<User> distinct(List<User> users) {
        return users.stream().distinct().collect(Collectors.toList());
    }
}
