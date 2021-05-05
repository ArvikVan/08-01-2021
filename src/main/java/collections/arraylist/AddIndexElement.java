package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// 3. Добавление элемента в список по индексу
public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>();
        if (!list.contains(str)) {
            list.add(index, str);
        } else {
            return false;
        }
        return 0 < list.size();
    }
}
