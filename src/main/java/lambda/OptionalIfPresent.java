package lambda;
/**
 * 1. Написать метод max(). Он находит максимальный элемент массива.
 * Если массив пуст, то возвращает пустой Optional, в противном случае Optinal из максимального значения
 * 2. Метод ifPresent() вызывает метод max(). Если значение существует,
 * то выводит максимальное значение например, "Max: 3". Для вывода нужно использовать System.out.println()
 * @author arviy
 * @version 1.0
 */

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent((i) -> System.out.println("Max: " + i));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        } else {
            int max = data[0];
            for (int i = 1; i < data.length; i++) {
                if (max < data[i]) {
                    max = data[i];
                }
            } return Optional.of(max);
        }
    }
}
