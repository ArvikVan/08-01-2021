import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ArvikV
 * @version 1.0
 * @since 03.04.2022
 * int[] removeDup(int[] input) {
 *  // 1 1 2 3 4 5 5 6 2
 * // Result =>  1 2 3 4 5 6
 * }
 */
public class TestSobes {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 3, 4, 5, 5};
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        set.forEach(System.out::println);
    }
}
