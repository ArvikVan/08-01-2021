public class Main {

    public static void main(String[] args) {
       /* int d = 1212;
        System.out.println("Стук " + d);
        System.out.println("Ping");*/
        equalsNum("13.6", "13.3");
    }

    public static int equalsNum(String firstNum, String secondNum) {
        int res = 0;
        Double first = Double.parseDouble(firstNum);
        Double sec = Double.parseDouble(secondNum);
        System.out.println(first);
        System.out.println(sec);
        if (first < sec) {
            res = -1;
        }
        if (first > sec) {
            res = 1;
        }
        if (first.equals(sec)) {
            res = 0;
        }
        System.out.println(res);
        return res;
    }
}
