package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortBySetTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("5", "4", "3", "2", "1");
        Set<String> result = com.company.sort.SortBySet.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("1", "2", "3", "4", "5"));
        Assert.assertEquals(expect, result);
    }

}