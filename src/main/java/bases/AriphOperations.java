package bases;

public class AriphOperations {
    public static void main(String[] args) {
  /*      int a , b, c;
        a = 17;
        b = 6;
        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        double d;
        d = a / b;
        System.out.println(d);
        d = a % b;//остаток от деления
        System.out.println(d);*/
        int a, b, c;
        a = 10;
        b = 5;
        c = a / b * a; //выражение выполняется слева направо, т.к. ассоциативность операции такова
        System.out.println(c);
    }
}
