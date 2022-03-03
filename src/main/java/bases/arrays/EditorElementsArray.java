package bases.arrays;
// 34. Изменить элементы двумерного массива.
//1. Если элемент массива больше значения el - элемент массива нужно заменить на разность между
// текущим значением элемента массива и значения el.
//2. Если элемент массива меньше или равен el - необходимо заменить текущий элемент массива 0.
public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > el) {
                    array[i][j] = array[i][j] - el;
                } else {
                    array[i][j] = 0;
                }
            }

        }
        return array;
    }
}
