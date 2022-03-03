package lambda;
/**
 * Ваша задача, написать метод поиск строки среди списка. В списке могут быть null элементы.
 * Чтобы обернуть найденное значение нужно использовать Optional.ofNullable().
 * Для безопасной проверки можно использовать Objects.equals().
 * Если что-то найдено, нужно вернуть Optional из этого значения, в противном случае пустой Optional
 * @author arviy
 * @version 1.0
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class OptionalOfNullableTest {

    @Test
    public void whenNotNull() {
        assertEquals(
                Optional.of("c"),
                lambda.OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNull() {
        assertEquals(
                Optional.empty(),
                lambda.OptionalOfNullable.findValue(
                        Arrays.asList("a", "b", "c", null),
                        null
                )
        );
    }

}