package iter;
/**
 * класс описывает работу обычного итератора
 * @author arvik
 * @version 1.0
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter implements Iterator {
    /**
     * два поля в данном случае, массив который лежит в основе коллекций
     * и точка-индекс с помощью которого будет производиться манипуляция
     * создаем конструктор и переопределяем методы нект и хэзнект
     */
    private final int[] data;
    private int index = 0;

    public Iter(int[] data) {
        this.data = data;
    }

    /**
     * курсор
     * @return показывает есть ли еще символ впереди
     */
    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    /**
     * выводит указанный элемент
     * @return сперва выводим элемент, потом его ++
     */
    @Override
    public Object next() {
        return data[index++];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Iter iter = new Iter(arr);
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
