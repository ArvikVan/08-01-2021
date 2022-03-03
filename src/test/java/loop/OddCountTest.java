package loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCountTest {

    @Test
    public void count() {
        assertEquals(1, OddCount.count(1, 2));
        assertEquals(2, OddCount.count(1, 3));
        assertEquals(2, OddCount.count(1, 4));
    }

    @Test
    public void count2() {
        assertEquals(3, OddCount.count(1, 5));
    }
}