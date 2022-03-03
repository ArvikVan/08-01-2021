package servision.store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import servision.model.Cat;
import servision.model.Item;

import java.util.List;
import java.util.function.Function;

/**
 * @author ArvikV
 * @version 1.0
 * @since 19.01.2022
 */
public class TodoStore implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    private static final class Lazy {
        private static final Store INST = new TodoStore();
    }

    public static Store instOf() {
        return Lazy.INST;
    }

    /**
     * Применен шаблон wrapper и лямбды
     * @param command на входе функциональный интерфейс,
     *                который принимает один аргумент и выдает результат
     * @param <T> параметризированный метод
     * @return на выходе результат и закрытая сессия
     */
    private <T> T tx(final Function<Session, T> command) {
        final Session session = sf.openSession();
        final Transaction tx = session.beginTransaction();
        try {
            T rsl = command.apply(session);
            tx.commit();
            return  rsl;
        } catch (final Exception e) {
            session.getTransaction().rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public Item createItem(Item item) {
        return (Item) this.tx(session -> session.save(item));
    }

    @Override
    public List<Item> readItem() {
        return this.tx(session -> session.createQuery("from Item").list());
    }

    @Override
    public List<Cat> readAllCategories() {
        return this.tx(session -> session.createQuery("from Category").list());
    }

    @Override
    public Item updateItem(Item item) {
        return null;
    }

    @Override
    public Item deleteItem(Item item) {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
