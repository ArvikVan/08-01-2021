package servlettobd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import servlettobd.servlet.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.01.2022
 */
public class BdStore implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    private static final class Lazy {
        private static final Store INST = new BdStore();
    }

    private BdStore() {
    }

    public static Store instOf() {
        return Lazy.INST;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public Item addToBd(Item item) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    @Override
    public Item findById(int id) {
        Item item = new Item();
        Session session = sf.openSession();
        session.beginTransaction();
        session.get(Item.class, id);
        item.setId(id);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    @Override
    public void deleteItem(Item item, int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        item.setId(id);
        session.delete(item);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Item> findAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        List result = session.createQuery("from Item").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public List<Category> findAllCategory() {
        List<Category> rsl = new ArrayList<>();
        try (Session session = sf.openSession()) {
            session.beginTransaction();

            rsl = session.createQuery("from Category", Category.class).list();

            session.getTransaction().commit();
        } catch (Exception e) {
            sf.getCurrentSession().getTransaction().rollback();
        }
        return rsl;
    }
}
