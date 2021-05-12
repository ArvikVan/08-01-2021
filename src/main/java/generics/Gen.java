package generics;

/**
 * класс описывает обобщение
 * @param <T>
 */
public class Gen<T> {
    T ob; // объявляем объект типа Т

    public Gen(T ob) { // конструктор
        this.ob = ob;
    }

    T getOb() { // возвращаем объект
        return ob;
    }

    void showType() { // метод для вывода типа импользуемого объекта
        System.out.println("Type of T is : " + ob.getClass().getName());
    }
}
