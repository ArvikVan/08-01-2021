package collections.map;
//12. Индексы символов
//При реализации необходимо игнорировать пробелы во входной строке.
//Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки,
//а значением - список индексов, под которыми этот символ (если таких символов несколько) входит в исходную строку.
//Важно: строчные и прописные символы считаются разными символами.

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        String stringWithoutSpace = s.replace(" ", "");
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < stringWithoutSpace.length(); i++) {
            char ch = stringWithoutSpace.charAt(i);
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < stringWithoutSpace.length(); j++) {
                char insideCh = stringWithoutSpace.charAt(j);
                if (insideCh == ch) {
                    list.add(j);
                }
            }
            map.put(ch, list);
        }
        return map;
    }
}
