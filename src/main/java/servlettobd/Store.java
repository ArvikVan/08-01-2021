package servlettobd;

import servlettobd.servlet.Category;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.01.2022
 */
public interface Store {
    Item addToBd(Item item);

    Item findById(int id);

    void deleteItem(Item item, int id);

    List<Item> findAll();

    public List<Category> findAllCategory();
}
