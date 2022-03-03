package func;
/**
 * 1.1. Predicate. Проверить, что число положительное
 */

import java.util.function.Predicate;

public class PredicateCheckPositive {
    public static boolean check(int num) {
      return check((p) -> p > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
