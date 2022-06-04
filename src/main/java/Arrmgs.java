import servlet.MainServlet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author ArvikV
 * @version 1.0
 * @since 06.04.2022
 */
public class Arrmgs {
    public static void main(String[] args) {
        ArrayList a = (ArrayList) intsInRange(40, 10, 100);
        System.out.println(a);

      /*  HashSet<Integer> tmp = new HashSet<Integer>();
        Integer[] b = new Integer[tmp.size()];
        b = (Integer[]) tmp.toArray(b);
        System.out.println(Arrays.toString(b));*/

    }

    public static List intsInRange(int size, int lowerBound, int upperBound) {
        List result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add((int) (Math.random() * (upperBound + 1 - lowerBound) + lowerBound));
        }
        return result;
    }

    public static List primeNumbersTill(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }
}
