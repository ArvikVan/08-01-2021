package collections.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
      List<String> list = new LinkedList<>();
        for (String element : s.split("")) {
            list.add(element);
        }
        list.sort(Comparator.naturalOrder());
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : list) {
            stringBuffer.append(str);
        }
        String st = stringBuffer.toString();
        return st;
    }
}
