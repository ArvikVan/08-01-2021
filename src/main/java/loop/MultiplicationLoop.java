package loop;
//Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
public class MultiplicationLoop {
    public static int out(int a, int b) {
        int result = 1;
        for (int i = a; i <= b; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        MultiplicationLoop.out(1, 3);
    }
}
