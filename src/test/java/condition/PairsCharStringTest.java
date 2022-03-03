package condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PairsCharStringTest {
    @Test
    public void checkTrue() {
        boolean rsl = condition.PairsCharString.check("", "");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkTrue1() {
        boolean rsl = condition.PairsCharString.check("sparkling", "groups");
        assertThat(rsl, is(true));
    }

    @Test
    public void checkFalse() {
        boolean rsl = condition.PairsCharString.check("booking", "grabber");
        assertThat(rsl, is(false));
    }
}