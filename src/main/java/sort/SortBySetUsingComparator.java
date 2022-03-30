package sort;
/**
 * класс описывает сортировку сета с компаратором
 * @author Arviy
 * @version 1.0
 */

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    /**
     * метод описывает сортировку сета в обратном порядке
     * @param list принимает на вход список
     * @return возвращает сет сортированный в обратном порядке
     */
    public static Set<String> sort(List<String> list) {
        Set<String> result = new TreeSet<>(Comparator.reverseOrder());
        result.addAll(list);
        return result;
    }
}
