import stream.FilterNumbers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterNumbersTest {
    @Test
    public void test() {
        assertEquals(List.of(2, 4), FilterNumbers.filter(List.of(1, 2, 3, 4)));
    }
}