package bases.conditions;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number to 10");
        int num = scanner.nextInt();

        if ((num < 9) && (num > 2)) {
            System.out.println("Число больше 2 и меньше 10");
        } else {
            System.out.println("Unknown number");
        }
    }
}
