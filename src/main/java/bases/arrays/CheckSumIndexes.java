package bases.arrays;

import java.util.Arrays;

//35. Исключить элементы из двумерного массива.
//Необходимо реализовать метод который вернет одномерный массив, который не будет содержать значений 0
// (необходимо использовать метод Arrays.copyOf()). При этом исходные данными будут следующими:
//1. Квадратный двумерный массив целочисленных значений data.
//2. Целочисленный элемент sum, который означает сумму индексов в массиве.
//При этом необходимо чтобы выполнились следующие условия:
//1. Если сумма индексов при переборе двумерного массива равна sum, то элемент с такими индексами должен принять
// значение 0.
//2. Выходной одномерный массив не должен содержать значения 0.
public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int length = 0;
        int count = 0, dataTempcount = 0;
        int nol = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                length++;
            }
        }
        int[] dataTemp = new int[length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++, count++) {
                if ((i + j) == sum) {
                    nol++;
                    data[i][j] = 0;
                } else {
                    dataTemp = Arrays.copyOf(dataTemp, ++dataTempcount);
                    dataTemp[dataTempcount - 1] = data[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(dataTemp));
        return dataTemp;
    }
}
