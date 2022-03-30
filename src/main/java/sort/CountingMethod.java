package sort;
/**
 * Метод Collectors.groupingBy() всегда первым параметром принимает функцию, по которой будет строиться ключ.
 * Вторым параметром может принимать Collector. Большинство методов Collectors возвращают Collector.
 *
 * Рассмотрим метод Collectors.counting(), этот метод ничего не принимает, а просто подсчитывает количество
 * элементов определенной группы
 * задача подсчитать количество работников для каждой компании
 * @author arviy
 * @version 1.0
 * https://metanit.com/java/tutorial/10.7.php
 */

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingMethod {
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

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        x -> x.getCompany().getName(),
                        Collectors.counting()
                ));
    }
}
