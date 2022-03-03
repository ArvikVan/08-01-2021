package bases.arrays;
//33. Проверка массива на уникальность элементов.
public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                count++;
            }
        }
        System.out.println(count + " " + data.length / 2);
        if (count < data.length / 2) {
            return true;
        }
        return false;
    }
}
