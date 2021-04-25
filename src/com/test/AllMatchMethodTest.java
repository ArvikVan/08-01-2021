package com.test;

import com.company.stream.AllMatchMethod;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllMatchMethodTest {
    @Test
    public void check() {
        assertTrue(AllMatchMethod.check(List.of("1234", "abcd")));
        assertFalse(AllMatchMethod.check(List.of("1234", "ac")));
    }

}