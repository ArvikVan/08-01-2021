package com.company.bases.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeriaTest {

    @Test
    public void test() {
        assertEquals(1, MaxLengthSeria.find(new int[] {1}));
        assertEquals(1, MaxLengthSeria.find(new int[] {2, 1}));
        assertEquals(2, MaxLengthSeria.find(new int[] {1, 2}));
        assertEquals(1, MaxLengthSeria.find(new int[] {3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(1, MaxLengthSeria.find(new int[]{1}));
        assertEquals(1, MaxLengthSeria.find(new int[]{2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(2, MaxLengthSeria.find(new int[]{1, 2}));
    }

    @Test
    public void test4() {
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3}));
    }
}