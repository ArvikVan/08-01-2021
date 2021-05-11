package iter;
/**
 * опишем работу итератора итераторов
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterIter<T> implements Iterator {
    private final Iterator<Iterator<T>> data;
    // сама структура итераторов
    private Iterator<T> cursor = Collections.emptyIterator();
    //указываем на курсор итератора в котором ведем работу

    public IterIter(Iterator<Iterator<T>> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        while (!cursor.hasNext() && data.hasNext()) {
            cursor = data.next();
        }
        return cursor.hasNext();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return cursor.next();
    }

}
