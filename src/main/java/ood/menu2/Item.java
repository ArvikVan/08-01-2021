package ood.menu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item {
    private String name;
    Action action;
    List<Item> items = new ArrayList<>();

    public Item(String name, Action action) {
        this.name = name;
        this.action = action;
    }

    void addItem(Item item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public Action getAction() {
        return action;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Item{"
                + "name='" + name + '\''
               +  ", action=" + action
               +  '}';
    }
}
