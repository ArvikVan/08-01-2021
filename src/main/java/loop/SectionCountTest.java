package com.company.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCountTest {

    @Test
    public void count1() {
        assertEquals(1, SectionCount.count(3, 2));
    }

    @Test
    public void count2() {
        assertEquals(1, SectionCount.count(1, 1));
    }

    @Test
    public void count3() {
        assertEquals(2, SectionCount.count(2, 1));
    }

    @Test
    public void count4() {
        assertEquals(2, SectionCount.count(4, 2));
    }
}