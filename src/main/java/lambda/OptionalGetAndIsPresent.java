package lambda;
/**
 * 1. Написать метод indexOf(). Он ищет индекс по значению.
 * Если индекс не найден, должно вернуться Optional.empty().
 * Если найден, то Optional из этого индекса
 * * 2. В методе get() нужно вызвать метод indexOf().
 * Если вернулся пустой Optinal, то метод должен вернуть -1, в противном случае сам индекс
 * @author arviy
 * @version 1.0
 */

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        if (OptionalGetAndIsPresent.indexOf(data, el).isPresent()) {
            return OptionalGetAndIsPresent.indexOf(data, el).get();
        } else {
            return -1;
        }
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        } return Optional.empty();
    }
}
