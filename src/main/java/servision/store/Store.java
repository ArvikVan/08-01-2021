package servision.store;

import servision.model.Cat;
import servision.model.Item;

import java.util.List;

/**
 * @author ArvikV
 * @version 1.0
 * @since 19.01.2022
 */
public interface Store {
    Item createItem(Item item);

    List<Item> readItem();

    List<Cat> readAllCategories();

    Item updateItem(Item item);

    Item deleteItem(Item item);
}
