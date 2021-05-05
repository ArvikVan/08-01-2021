import com.company.stream.NoneMatchMethod;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NoneMatchMethodTest {
    @Test
    public void test() {
        assertTrue(NoneMatchMethod.check(List.of("1", "2", "3")));
        assertFalse(NoneMatchMethod.check(List.of("1", "", "3")));
    }
}