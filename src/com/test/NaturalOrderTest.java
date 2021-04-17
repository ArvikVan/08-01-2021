package com.test;

import com.company.sort.NaturalOrder;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class NaturalOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}