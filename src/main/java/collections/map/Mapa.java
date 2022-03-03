package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mapa {
    public static void main(String[] args) {
        HashMap<Integer, List> hashMap = new HashMap<>();
        List<String> list = List.of("listone", "listtwo", "listthree");

        hashMap.put(1, list);
        hashMap.put(2, list);
        hashMap.put(3, list);
        hashMap.put(4, list);
        hashMap.put(5, list);

        /*for (Integer i : hashMap.keySet()) {
            hashMap.
            System.out.println(i + " " + hashMap.get(i));
        }*/
    }
}
