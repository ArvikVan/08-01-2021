package com.test;

import com.company.stream.DistinctForPrimitive;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DistinctForPrimitiveTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[] {1, 2, 3, 1, 2, 3})
        );
    }
}