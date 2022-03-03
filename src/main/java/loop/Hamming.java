package loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Hamming.checkStrings("101010111", "111010100");
        Hamming.checkStrings("2173896", "2233796");
        Hamming.checkStrings("abcde", "bcdef");
        Hamming.checkStrings("abcde", "abcde");
    }
}
