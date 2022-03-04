package preptointerview;
import java.lang.String;

/**
 * @author ArvikV
 * @version 1.0
 * @since 04.03.2022
 */
public class StringvsStringbuilder {
    public static void main(String[] args) {
        String x = "string";
        System.out.println("the same object -  " + x);
        x = x.toUpperCase();
        System.out.println("new object -  " + x);
        StringBuilder y = new StringBuilder("sdfsdfasdf");
        System.out.println("the same object - " + y);
        y.append("11");
        System.out.println("the same object - " + y);
    }
}
