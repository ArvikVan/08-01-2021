package concurency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Config {
    private final String path;
    private final Map<String, String> values = new HashMap<>();

    public Config(final String path) {
        this.path = path;
    }

    /**
     * используем конструкцию try-with-resources
     * открываем поток (декоратор) оборачиваем new BufferedReader(new FileReader())
     * бежим по строкам файла
     * если не начинается с # и не пуст
     * делим строку в массив по =
     * проверяем 2) на файла с нарушением шаблона ключ=значение (напр. ключ=)
     * в этом случае нужно ожидать исключение IllegalArgumentException
     * кладем то что слева от = в ячейку 0, то что справа от = в ячейку 1
     */
    public void load() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.path))) {
            bufferedReader.lines().forEach(x -> {
                if (!x.startsWith("#") && !x.isEmpty()) {
                    String[] s = x.split("=");
                    if (s.length < 2) {
                        throw new IllegalArgumentException("wrong Argument");
                    }
                    values.put(s[0], s[1]);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * метод value(String key) он должен возвращать значение ключа.
     * @param key на входе ключ который надо вернуть
     * @return возвращаем этот ключ
     */
    public String value(String key) {
        return values.get(key);
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Config("./data/app.properties"));
    }
}
