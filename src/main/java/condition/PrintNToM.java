package condition;

public class PrintNToM {
    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNToM.out(0, 5);
    }
}
