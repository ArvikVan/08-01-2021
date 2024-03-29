package bases.arrays;
//28. Объединить 3 массива
//Метод принимает 3 массива целочисленных значений, при этом каждый обладает следующими свойствами:
//1. Имеет произвольную длину массива.
//2. Массив всегда имеет нечетное число элементов.
//3. Массив имеет количество элементов на 1 больше, чем массив из пункта 2.
//Необходимо реализовать метод, который объединит три массива в один. При этом должны выполниться следующие условия:
//1. Из первого массива в результирующий массив должны попасть только первый и последний элемент, причем в результирующем
// массиве они должны находиться на первом и последнем месте, соответственно.
//2. Элементы с нечетными индексами из второго массива должны находиться в результирующем массиве на местах с четными индексами.
//3. Элементы с четными индексами из третьего массива, должны находиться в результирующем массиве на местах с нечетными индексами.
public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 2; i < middle.length; i += 2) {
            result[i] = middle[i - 1];
        }
        for (int i = 1; i < right.length; i += 2) {
            result[i] = right[i - 1];
        }
        return result;
    }
}
