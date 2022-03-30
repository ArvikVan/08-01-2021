package sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysSortTest {

    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = sort.ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        Assert.assertArrayEquals(expect, result);
    }
}