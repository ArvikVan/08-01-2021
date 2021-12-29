package telegramtask;

/**
 * @author arvikv
 * @version 1.0
 * @since 29.12.2021
 */
public class NumCircle {
    /**
     * получаем от 1 до 100 (num = num + 1;)
     * получаем 0, 100 раз (num = num++;)
     * @param args args
     */
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num = num++;
            System.out.println(num);
        }
    }
}
