package stream;
/**
 * Ниже, приведен код. Создайте стрим из переданной коллекции
 * @author arviy
 * @version 1.0
 */

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
