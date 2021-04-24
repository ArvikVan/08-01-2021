package com.company.stream;
/**Иногда нам может понадобиться произвести редукцию с начальным значением.
 * Для этого есть перегруженный метод reduce().
 * Первый аргумент начальное значение, второй оператор.
 * В отличие от первого метода, который принимает один аргумент,
 * этот метод возвращает начальное значение для пустого списка, а не Optional.
 * Ваша задача умножить 5 на элементы списка
 */

import java.util.List;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream()
                .reduce(5, (n1, n2) -> n1 * n2);
    }
}
