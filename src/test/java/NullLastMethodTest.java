import sort.NullLastMethod;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NullLastMethodTest {

    @Test
    public void nullLastTest() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullLastMethod.nullLast());
        assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}