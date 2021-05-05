package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// 12. ListIterator для списка.
public class ListIteratorUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        ListIterator listIterator = list.listIterator();
        System.out.println("Start iterate...");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Change direction iterate...");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("Finish iterate...");
    }
}
