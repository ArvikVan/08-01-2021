package loop;
//9.5. Сумма цифр
//
//Дано число, нужно получить сумму его цифр
public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        int ostatok = 0;
       while (num >= 1) {
           ostatok = num % 10;
           sum = sum + ostatok;
           num = num / 10;
       }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        //DigitSum.sum(12);
        DigitSum.sum(1234);

    }
}
