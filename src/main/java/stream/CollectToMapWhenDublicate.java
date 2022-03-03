package stream;
/**
 * Метод, который был показан ранее нельзя использовать,
 * если стрим содержит дубликаты. Для того чтобы собрать данные в мапу в этом случае,
 * мы можем использовать методы collect() и Collectors.toMap(), но перегруженный. Сборка идет в HashMap
 * 1 аргумент - ключ
 * 2 аргумент - значение
 * 3 аргумент - указываем, что делать в случае дубликата ключа, оставим мы старое значение или новое
 * В примере, ключом и значением будет сам элемент, а в случае дубликата мы указываем, что останется предыдущее значение
 * собрать, переданный стрим чисел в мапу, где ключ сам элемент,
 * а значение это его квадрат. Нужно использовать версию toMap() описанную в задании.
 * @author arviy
 * @version 1.0
 */

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDublicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
