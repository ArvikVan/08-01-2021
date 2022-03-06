package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.03.2022
 */
public class FiboLow {
    public static void main(String[] args) {
        System.out.println(recursFibo(10));
        System.out.println(newRibo(100));

    }

    private static long recursFibo(int n) {
        if (n <= 1) {
            return n;
        }
        return recursFibo(n - 1) + recursFibo(n - 2);
    }

    private static long newRibo(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
