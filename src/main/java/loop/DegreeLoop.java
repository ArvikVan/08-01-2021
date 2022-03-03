package loop;
//Дано целое число a и целое число degree (> 0).
//Найти a в степени degree: a^degree = a·a· . . . ·a (числа a перемножаются degree раз).
public class DegreeLoop {
    public static int calculate(int a, int degree) {
      int result = 1;
        for (int i = 1; i <= degree; i++) {
          result *= a;
      } return result;
    }

    public static void main(String[] args) {
        DegreeLoop.calculate(4, 2);
    }
}
