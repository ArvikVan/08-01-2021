package sort;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListSortTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList(null, "a", "b", "c");
        List<String> result = com.company.sort.ListSort.sort(input);
        List<String> expected = Arrays.asList("c", "b", "a", null);
        Assert.assertEquals(expected, result);
    }

}