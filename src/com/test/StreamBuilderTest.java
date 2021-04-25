package com.test;


import com.company.stream.StreamBuilder;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamBuilderTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 3);
        assertEquals(expect, list);
    }
}