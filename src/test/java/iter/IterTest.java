package iter;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IterTest {

    @Test
    public void whenHasNextJob() {
        Iter iter = new Iter(
                new int[] {1, 2, 3}
        );
        assertThat(iter.hasNext(), is(true));
    }

    @Test
    public void whenNextJob() {
        Iter iter = new Iter(
                new int[] {1, 2, 3}
        );
        assertThat(iter.next(), is(1));
        assertThat(iter.next(), is(2));
        assertThat(iter.next(), is(3));
    }

}