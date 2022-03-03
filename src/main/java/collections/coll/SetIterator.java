package collections.coll;
// 2. Итератор для Set.
//Iterator<E> iterator() - метод возвращает объект Iterator, который позволяет обойти весь набор значений.
//boolean hasNext() - метод проверяет существует ли следующий элемент в наборе.
//E next() - метод перемещает курсор на следующий элемент в наборе и при этом возвращает его.
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
