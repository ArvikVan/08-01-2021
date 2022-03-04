package preptointerview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ArvikV
 * @version 1.0
 * @since 04.03.2022
 */
public class Recurs {
    public static void main(String[] args) {
        meth(0);
        System.out.println();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(3, "three");
        for (Object o : map.values()) {
            System.out.print(o.hashCode() + " ");
        }
    }

    public static void meth(int n) {
        System.out.print(n + " ");
        if (n == 10) {
            return;
        }
        meth(n + 1);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
