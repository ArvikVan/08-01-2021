package bases.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousTest {

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, bases.arrays.SummingPrevious.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, bases.arrays.SummingPrevious.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, bases.arrays.SummingPrevious.calculate(1, 2, 5));
    }

}