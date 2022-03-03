package stream;
/**
 * Ваша задача найти первую строку, которая кончается на ".java" и вернуть Optional из длины этой строки
 * @author arviy
 * @version 1.0
 */

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .findFirst()/**
         получаем элемент из стрима, если пусто то вернем пустой Optional
         если есть то возвращаем нулевой элемент Optional**/
                .filter(n -> n.endsWith(".java"))// фтильтрууем по ".java"
                .flatMap(x -> Optional.of(x.length())); //возвращаем Optional из длины строки
    }
}
