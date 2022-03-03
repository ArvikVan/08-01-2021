package stream;
/**
 * Если условие громоздкое, то можно расположить несколько вызовов filter подряд.
 * Ваша задача отфильтровать список строк по следующему признаку.
 * Строка должна начинаться на "A" и заканчиваться на ".java"
 *
 */

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(x -> x.startsWith("A"))
                .filter(x -> x.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
