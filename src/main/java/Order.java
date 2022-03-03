import java.util.Scanner;

/**
 * @author ArvikV
 * @version 1.0
 * @since 23.02.2022
 */
public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input = 0; // Ввод пользователя
        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}
