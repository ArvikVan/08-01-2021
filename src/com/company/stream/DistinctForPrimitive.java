package com.company.stream;
/**
 * Для того, чтобы получить стрим из уникальных элементов мы можем использовать метод distinct().
 * Если мы используем стрим примитивов, то сравнение элементов идет через ==, если стрим объектов,
 * то через метод equals.
 * Stream.of () является оберткой над методом Arrays.stream ()
 * Arrays.stream(data) работает для примитивов
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        // подойдет и Arrays.stream(data) создает поток типа IntStream
        return IntStream.of(data)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }
}
