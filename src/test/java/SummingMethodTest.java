import stream.SummingMethod;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static stream.SummingMethod.*;

public class SummingMethodTest {

    @Test
    public void test() {
        Bill b1 = new Bill(1);
        Bill b2 = new Bill(2);
        Bill b3 = new Bill(3);
        Bill b4 = new Bill(4);
        Bill b5 = new Bill(5);
        Bill b6 = new Bill(6);
        User u1 = new User("u1", List.of(b1));
        User u2 = new User("u2", List.of(b2, b3));
        User u3 = new User("u3", List.of(b4, b5, b6));
        Map<String, Integer> expect = Map.of(
                "u1", 1,
                "u2", 5,
                "u3", 15
        );
        assertEquals(expect, SummingMethod.summing(List.of(u1, u2, u3)));
    }

}