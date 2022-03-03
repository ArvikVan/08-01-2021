package bases.arrays;
// 26. Получить правую диагональ квадратного массива
public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] diag = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                diag[i] = data[i][data.length - 1 - i];
            }
        } return diag;
    }
}
