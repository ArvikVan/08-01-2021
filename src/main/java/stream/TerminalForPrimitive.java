package stream;
/**
 * min(), max() возвращают OptionalInt, для получения элемента нужно использовать метод getAsInt()
 *
 * average() возвращает OptionalDouble, для получения элемента нужно использовать метод getAsDouble()
 *
 * Ваша задача дописать методы. Для получения стрима нужно использовать Arrays.stream()
 * @author arviy
 * @version 1.0
 */

import java.util.Arrays;

public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).max().getAsInt();
    }

    public long min() {
        return Arrays.stream(data).min().getAsInt();
    }

    public double avg() {
        return Arrays.stream(data).average().getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }

}
