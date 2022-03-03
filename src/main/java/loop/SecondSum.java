package loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i = i + 2) {

            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        SecondSum.sum(1, 5);
    }
}
