import stream.BoxedMethod;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoxedMethodTest {

    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                BoxedMethod.boxed(new int[] {1, 2, 3})
        );
    }

}