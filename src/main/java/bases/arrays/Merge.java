package bases.arrays;

import java.awt.datatransfer.SystemFlavorMap;

// 3. Объединить два отсортированных массива
public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int count = 0, countLeft = 0, countRight = 0;
        while (count < rsl.length) {
            if (left.length == 0) {
                rsl = right;
                break;
            }
            if (right.length == 0) {
                rsl = left;
            }
            rsl[count] = (left[countLeft] < right[countRight] ? left[countLeft++] : right[countRight++]);
            if (countLeft == left.length) {
                System.arraycopy(right, countRight, rsl, ++count, right.length - countRight);
                break;
            }
            if (countRight == right.length) {
                System.arraycopy(left, countLeft, rsl, ++count, left.length - countLeft);
                break;
            }
            count++;
        }
        return rsl;
    }
}
