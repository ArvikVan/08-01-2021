package condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String str;
        if (rsl == left + right) {
            str = "added";
        } else if (rsl == left - right) {
            str = "subtracted";
        } else if (rsl == left * right) {
            str = "divided";
        }
        return "none";
    }
}
