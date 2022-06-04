package stream04072022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ArvikV
 * @version 1.0
 * @since 04.06.2022
 */
public class TestItem {
    public static void main(String[] args) {
        Item item = new Item(1L, "first", 100);
        Item item2 = new Item(2L, "first", 200);
        Item item3 = new Item(3L, "first", 300);
        List<Item> list = new ArrayList<>();
        list.add(item);
        list.add(item2);
        list.add(item3);
        List<Item> itemList = list.stream().filter(i -> i.getSsn() >= 200).collect(Collectors.toList());
        System.out.println(itemList);
        list.stream().filter(i -> i.getSsn() >= 200).forEach(System.out::println);
        List<Integer> integerList = List.of(5, 25, 65, 12, 31);
               int i =  integerList.stream().reduce((nakopitel, element) -> nakopitel * element).get();
        System.out.println(i);
    }
}
