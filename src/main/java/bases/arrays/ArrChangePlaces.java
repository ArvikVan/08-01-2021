package bases.arrays;

public class ArrChangePlaces {
    public static void main(String[] args) {
        String[] arr = {"First", "Second", "Third", "Forth", "Fifth"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        int n = arr.length;
        String temp;
        for (int i = 0; i < n - i - 1; i++) { // основной код для решения замены на противополжный индекс
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
