package stream;
/**
 *
* Iterator это метод, который позволяет пробежаться по элементам коллекции
* Iterator<Integer> - это метод который пробегается по элементам коллекции содержащей Integer
* Iterator<Iterator<Integer>> - это метод который пробегает по итераторам Iterator<Integer>
*
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            while (iterator.hasNext()) {
                rsl.add(iterator.next());
            }
        }
        return rsl;
    }
}
