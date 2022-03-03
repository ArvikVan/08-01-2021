import stream.CollectToSet;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CollectToSetTest {
    @Test
    public void coll() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expect = Set.of(1, 2);
        assertEquals(expect, CollectToSet.collect(input.stream()));
    }

}