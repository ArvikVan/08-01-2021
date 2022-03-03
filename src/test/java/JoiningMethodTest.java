import stream.JoiningMethod;
import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

public class JoiningMethodTest {

    @Test
    public void test() {
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(),
                "Prefix",
                "Suffix"
        );
        expect.add("A");
        expect.add("B");
        expect.add("C");
        assertEquals(
                expect.toString(),
                JoiningMethod.join(List.of(
                        "A", "B", "C"
                ))
        );
    }
}