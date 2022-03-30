package sort;
/**
 * класс описывает сортировку по убыванию с null в конце
 * @author Arviy
 * @version 1.0
 */

import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;

    }
}
