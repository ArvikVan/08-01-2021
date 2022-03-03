package collections.map;
//14. Ферма
//Метод принимает отображение: ключ - объект класса Animal, а значение - количество животных этого класса на ферме.
// При этом объект класса Animal содержит 2 поля: имя и количество ног у животного. Необходимо реализовать метод так,
// чтобы на выходе у нас получилась общая сумма ног животных на ферме.
import java.util.*;

public class Farm {
    public static int sumLegs(Map<Animal, Integer> data) {
     Map<Animal, Integer> map = new HashMap<>(data);
     int result = 0;
        for (Animal animal : data.keySet()) {
            result += animal.getLegs() * map.get(animal);
        }
        return result;
    }

    public static class Animal {
        private String name;

        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
