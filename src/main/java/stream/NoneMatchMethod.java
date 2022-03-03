package stream;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(n -> n.length() == 0);
    }
}
