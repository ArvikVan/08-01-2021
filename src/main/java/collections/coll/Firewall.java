package collections.coll;
// 4. Собственный файерволл
//1. Если в строке нет ни одного слова из коллекции Set, то метод должен вернуть строку: Вы сделали правильный выбор!
//2. Если в строке имеется хоть одно из слов из коллекции Set, метод должен вернуть строку: Выберите другую статью...
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] strings = s.split(" ");
        for (String str : strings) {
         if (words.contains(str)) {
             return "Выберите другую статью...";
         }
        }
        return "Вы сделали правильный выбор!";
    }
}
