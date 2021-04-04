package com.test;

import com.company.sort.NullFirstMethod;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NullFirstMethodTest {

    @Test
    public void nullFirstTest() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullFirstMethod.nullFirst());
        assertEquals(Arrays.asList(null, "1", "2", "3"), list);
    }
}