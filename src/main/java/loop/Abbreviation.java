package loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            char a = s.charAt(i);
            if (Character.isUpperCase(a)) {
                stringBuilder.append(a);

            }
        }
        return stringBuilder.toString();
    }
}
