package stream;
/**
 * Как вы наверное уже догадались поиск минимального элемента представляет собой также редукцию.
 * Этот метод принимает Comparator и возвращает Optional. Если список пуст вернется пустой Optional.
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 * @author arviy
 * @version 1.0
 */

import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream()
                .min((n1, n2) -> Integer.compare(n1.length(), n2.length()))
                .get();
    }
}
