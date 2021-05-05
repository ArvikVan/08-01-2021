package collections.arraylist;
//6. Удаление и замена элементов в списке
import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String string = list.remove(list.size() - 1);
        if (index <= list.size()) {
            list.set(index, string);
        }
        return list;
    }
}
