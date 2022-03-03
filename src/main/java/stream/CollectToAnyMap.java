package stream;
/**
 * Ранее мы сталкивались с реализацией toMap с тремя аргументами.
 * Этот метод перегружен и имеет реализацию с четырьмя аргументами,
 * где в качестве четвертого аргумента мы можем указать реализацию Map, которую мы хотим получить
 * * Например
 * * Map<Integer, Integer> map =
 * List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, TreeMap::new));
 * * В данном случае мы получим реализацию Map, но только TreeMap.
 * * Ваша задача собрать Map из стрима чисел, где ключ это само число, а значение его квадрат.
 * Сборка должна быть в LinkedHashMap
 * @author arviy
 * @version 1.0
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors
                .toMap(key -> key, value -> value * value, //первй и второй аргументы
                        (p, c) -> p, LinkedHashMap::new)); // третий и четвертый аргументы
    }
}
