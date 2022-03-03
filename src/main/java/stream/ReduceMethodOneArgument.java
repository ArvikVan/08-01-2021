package stream;
/**В Stream есть метод reduce(BinaryOperator<T> operator).
 * Этот метод находит первый элемент стрима, он становится результатом,
 * а потом уже начинает применять оператор к последующим элементам.
 * Ваша задача найти произведение чисел, используя данный метод.
 * Размер списка всегда больше 0
 * @author arviy
 * @version 1.0
 */

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((n1, n2) -> n1 * n2)
                .get();
    }
}
