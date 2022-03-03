package bases;

import java.util.Scanner;

public class ConsolInput {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);//
        System.out.println("Input a number:");
        int num = s.nextInt();
        System.out.printf("Your number is: %d", num);// %d спецификатор, на место которого идет переменная num
        //%d - целочисленное значение
        //%x - шеснадцатеричное значение
        //%e - для вывода экспоненты
        //%с - для вывода одного символа
        //%s - для вывода строки
        s.close();*/
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine(); //nextLine() отвечает за вывод строки
        System.out.println("Input age: ");
        int age = in.nextInt(); //nextInt() отвечает за вывод числа
        System.out.println("Input Height: ");
        float h = in.nextFloat(); //nextFloat() отвечает за вывод числа с плавающей точкой
        System.out.printf("Name: %s Age: %d Height: %.2f", name, age, h);
        in.close();
    }
}
