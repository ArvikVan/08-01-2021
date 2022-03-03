package stream;
/**
 * класс описывает создание коллекции и добавление элемента.
 * Коллекцией будет LinkedList, для добавление нужно использовать метод add()
 * @author arviy
 * @version 1.0
 */

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = () -> new LinkedList<Integer>();
        BiConsumer<List<Integer>, Integer> biConsumer = (list1, e) -> list1.add(e);
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }
}
