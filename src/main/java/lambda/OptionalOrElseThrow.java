package com.company.lambda;
/**
 * написать метод поиска пользователя по логину. Если ничего не найдено, то нужно вернуть исключение
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public static class UserNotFoundException extends RuntimeException { }

        public static User orElseThrow(List<User> list, String login) {
            return search(list, login).orElseThrow(UserNotFoundException::new);
        }

        private static Optional<User> search(List<User> list, String login) {
            Optional<User> user = Optional.empty();
            for (User u : list) {
                if (u.getLogin().contains(login)) {
                    user = Optional.of(u);
                }
            }
            return user;
        }
    }
}
