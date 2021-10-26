package ood.menu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Item> list = new ArrayList<>();

    public void add(String parentName, Item child) {
        if (parentName.equals("Menu")) {
            list.add(child);
        } else {
            add(parentName, child, this.list);
        }
    }

    public void add(String parentName, Item child, List<Item> list) {
        for (Item item : list) {
            if (item.getName().contains(parentName)) {
                item.addItem(child);
            } else {
                add(parentName, child, item.getItems());
            }
        }
    }

    public void print() {
        for (Item item : list) {
            print(item);
        }
    }

    private void print(Item item) {
        System.out.println(item.getName());
        for (Item itemChild : item.getItems()) {
            print(itemChild);
        }
    }

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.add("Menu", new Item("Задача 1.", new SomeAction()));
        menu.add("Задача 1.", new Item("--Задача 1.1.", new SomeAction()));
        menu.add("Задача 1.", new Item("--Задача 1.2.", new SomeAction()));
        menu.add("--Задача 1.1.", new Item("----Задача 1.1.1.", new SomeAction()));
        menu.add("--Задача 1.1.", new Item("----Задача 1.1.2.", new SomeAction()));
        menu.print();
    }
}
