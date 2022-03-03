package collections.coll;
// 1. Уникальные имена
// Задание: метод принимает список пользователей, при этом много пользователей могут иметь одинаковое имя.
// Метод должен определить количество уникальных имен, которые имеют пользователи.
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class UniqueName {
    public static int collectUniqueName(List<collections.coll.User> users) {
        HashSet<collections.coll.User> hashSet = new HashSet<>();
        hashSet.addAll(users);
        return hashSet.size();
    }

}
