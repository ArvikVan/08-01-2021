package com.test;

import com.company.sort.ReverseOrder;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ReverseOrderTest {

    @Test
    public void reverseOrderTest() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}