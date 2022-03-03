package stream;
/**
 * найти тел. номера пользователя с заданным id, которые начинаются с region
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.stream.Collectors;

public class OptionalStream {
    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(x -> x.getId() == id) // фильтруем все по id
                .flatMap(x -> x.getNumbers().stream()) // создаем поток фильрованных элементов
                .filter(x -> x.getPhone().startsWith(region)) // фильтруем номера которые начинаются с region
                .collect(Collectors.toList()); //пихаем в коллекцию результат
    }
}
