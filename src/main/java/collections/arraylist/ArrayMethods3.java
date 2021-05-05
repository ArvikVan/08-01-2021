package collections.arraylist;
//.addAll() .clear() .indexOf()
import java.util.ArrayList;

public class ArrayMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");
        arrayList.add("Четвертый");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ПервыйПервый");
        arrayList1.add("ВторойВторой");
        arrayList1.add("ТретийТретий");
        arrayList1.add("ЧетвертыйЧетвертый");

        arrayList.addAll(2, arrayList1);
        System.out.println(arrayList);

        arrayList1.clear();
        System.out.println(arrayList1);
//не получается, не видит индекс
        int index = arrayList1.indexOf("");
        System.out.println(index);
    }
}
