package bases.arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortedTest {

    @Test
    public void whenSorted() {
        assertThat(
                bases.arrays.Sorted.isSorted(
                        new int[] {1, 2, 3}
                ),
                is(true)
        );
    }

    @Test
    public void whenNotSorted() {
        assertThat(
                bases.arrays.Sorted.isSorted(
                        new int[] {1, 3, 2}
                ),
                is(false)
        );
    }
}