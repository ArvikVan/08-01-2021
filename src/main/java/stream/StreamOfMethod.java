package com.company.stream;
/**
 * Иногда у нас есть последовательность и мы хотим создать стрим из этой последовательности.
 * Для этого мы можем использовать метод Stream.of(T...)
 * Ниже приведен код, создайте стрим из символов 'a', 'b', 'c'
 * @author arviy
 * @version 1.0
 */

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
