import com.company.collections.map.ComputeIfAbsent;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ComputeIfAbsentTest {
    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "", 2, ""));
        List<ComputeIfAbsent.User> users = List.of(
                new ComputeIfAbsent.User(1, "name1"),
                new ComputeIfAbsent.User(2, "name2"),
                new ComputeIfAbsent.User(3, "name3"),
                new ComputeIfAbsent.User(4, "name4")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        Map<Integer, String> expected = Map.of(4, "name4", 1, "name1", 2, "name2", 3, "name3");
        assertThat(rsl, is(expected));
    }
}