package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * класс описывает сортировку объектов, в данном случае по убыванию
 * @author Arviy
 * @version 1.0
 */
public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
