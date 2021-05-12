package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen = new Gen<>(88);
        integerGen.showType();
        System.out.println("The value is: " + integerGen.getOb());

        Gen<String> stringGen = new Gen<>("This is string");
        stringGen.showType();
        System.out.println("The value of string is: " + stringGen.getOb());

        TwoGen<Integer, String> integerStringTwoGen = new TwoGen<>(55, "TwoGen simple");
        integerStringTwoGen.getObjT();
        integerStringTwoGen.showTypes();
        integerStringTwoGen.getObjV();
    }
}
