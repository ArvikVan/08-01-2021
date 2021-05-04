package com.company.bases.arrays;
///36. Сумма элементов, пока не выполнится условие.
//1. Массив целочисленный значений data.
//2. Целое число el, которое мы будем искать в массиве data.
//При этом должны выполниться следующие условия:
//1. Метод должен вернуть сумму элементов массива data, которые находятся до элемента el
//2. Если окажется что сумма элементов - четное число - необходимо вернуть это число, иначе - 0.
public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int i = 0, sum = 0;
        for (int j = 0; j < data.length; j++) {
            if (data[j] == el) {
                break;
            }
            sum += data[j];
        } if (sum % 2 == 0) {
            return sum;
        } else {
            return 0;
        }
    }
}
