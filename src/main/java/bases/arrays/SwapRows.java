package bases.arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] datatemp = new int[data[src].length];
        for (int i = 0; i <= data.length; i++) {
            datatemp[i] = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = datatemp[i];
        }
    }
}
