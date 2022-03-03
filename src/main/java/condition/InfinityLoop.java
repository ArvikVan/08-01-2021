package condition;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity" + index);
            index = index - 1;
        }
    }
}
