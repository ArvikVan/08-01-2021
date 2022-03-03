package stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals(3, StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}