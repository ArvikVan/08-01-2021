package bases.arrays;

public class Foreach {
    public static int indexOf(int[] arr, int el) {
        int rst = -1;
        for (int index : arr) {
            System.out.print(index + " ");
            if (arr[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
       // int[] arr = new int[]{4, 5, 6, 8, 5};
        //foreach.indexOf(5, 6);
    }
}
