import stream.OptionalFlatMap;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalFlatMapTest {

    @Test
    public void whenExist() {
        assertEquals(
                Optional.of("Hello.java".length()),
                OptionalFlatMap.flatMap(
                        List.of("Hello.java", "Hello.js", "Hello.py")
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                Optional.empty(),
                OptionalFlatMap.flatMap(
                        List.of("Hello.cpp", "Hello.js", "Hello.py")
                )
        );
    }

}