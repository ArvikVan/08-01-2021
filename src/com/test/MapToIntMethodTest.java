package com.test;

import com.company.stream.MapToIntMethod;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MapToIntMethodTest {
    @Test
    public void sumMapToInt() {
        assertEquals(294, MapToIntMethod.sum(List.of('a', 'b', 'c')));
    }

}