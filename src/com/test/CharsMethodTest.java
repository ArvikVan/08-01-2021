package com.test;

import com.company.stream.CharsMethod;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CharsMethodTest {

    @Test
    public void test() {
        String input = "123";
        List<Character> expect = List.of('1', '2', '3');
        assertEquals(expect, CharsMethod.symbols(input));
    }

}