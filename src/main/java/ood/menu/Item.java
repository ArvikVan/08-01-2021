package ood.menu;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private String level;

    public Item(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
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
        return Objects.equals(level, item.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public int compareTo(Item o) {
        return this.level.compareTo(o.getLevel());
    }
}
