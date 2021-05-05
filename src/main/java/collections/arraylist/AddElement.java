package collections.arraylist;
// 2. Размер списка и добавление элементов.
import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.add(str);
        return check.size() > list.size();
    }
}
