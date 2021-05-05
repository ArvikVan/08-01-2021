package collections.arraylist;
// 15. Геометрическая прогрессия
import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> data = new ArrayList<>();
        int rsl = 0;
        for (int i = 1; i <= count; i++) {
            int num = first * (int) Math.pow(denominator, i - 1);
            data.add(num);
        }
        for (int num : data) {
            rsl = rsl + num;
        }
        return rsl;
    }
}
