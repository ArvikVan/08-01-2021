package lambda;

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
      lambda.StringFunc revers = (str) -> { //вызываем функциональный интерфейс и впихуем лямбду
          String result = ""; //переменная где хранится и складывается символ
          //для прохода по всем символам слова составляем цикл
          for (int i = str.length() - 1; i >= 0; i--) {
              result += str.charAt(i);
          } return result;
      };
        System.out.println("" + revers.func("Говно"));
        System.out.println("" + revers.func("Арвий Юрьевич Хубецов"));
    }
}
