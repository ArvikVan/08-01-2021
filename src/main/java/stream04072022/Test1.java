package stream04072022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ArvikV
 * @version 1.0
 * @since 04.06.2022
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        /*for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }*/
        List<Integer> list1 = list.stream().map(i -> i.length()).collect(Collectors.toList());
        System.out.println(list1);
        int[] arr = {1, 2, 3, 4, 5, 6, -5, -2};
        Arrays.stream(arr).map(i -> {
            if (i > 0) {
                System.out.println(i + " Положительное число");
            }
            return i;
        }).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
