package stream;
/**
 * Если у нас стрим из примитивов, а мы хотим получим стрим из объектов
 * оберток этого примитива, то мы можем использовать метод boxed()
 */

import javax.swing.event.InternalFrameEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
            return Arrays.stream(data).boxed().collect(Collectors.toList());
    }
}
