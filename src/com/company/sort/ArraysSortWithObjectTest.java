package com.company.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysSortWithObjectTest {

    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result =ArraysSortWithObject.sort(input);
        String[] expected = {"c", "b", "a"};
        Assert.assertArrayEquals(expected, result);
    }

}