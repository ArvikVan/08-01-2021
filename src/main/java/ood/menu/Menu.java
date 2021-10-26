package ood.menu;

import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
    private final String exit = "out";
    private TreeMap<Item, Action> tree;

    public void console() {
        Scanner scanner = new Scanner(System.in);
        callMenu();
        String answer = scanner.next();
        while (!answer.equals(exit)) {
            if (tree.containsKey(new Item(answer))) {
                System.out.println(tree.get(new Item(answer)).action());
            } else {
                System.out.println("Введен неправильный номер задачи");
            }
            System.out.println();
            callMenu();
            answer = scanner.next();
        }
    }

    public void callMenu() {
        if (tree == null) {
            tree = new TreeMap<>();
            setTree();
        }
        System.out.println("Меню:");
        for (var a : tree.entrySet()) {
            System.out.println("Задача " + a.getKey().getLevel());
        }
        System.out.print("Введите номер задачи: ");
    }

    public void setTree() {
        tree.put(new Item("1"), new SomeAction("1"));
        tree.put(new Item("1.1"), new SomeAction("1.1."));
        tree.put(new Item("1.1.1"), new SomeAction("1.1.1"));
        tree.put(new Item("1.1.2"), new SomeAction("1.1.2"));
        tree.put(new Item("1.2"), new SomeAction("1.2"));
        tree.put(new Item("2"), new SomeAction("2"));
        tree.put(new Item("2.1"), new SomeAction("2.1"));
        tree.put(new Item("2.2"), new SomeAction("2.2"));
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.console();
    }
}
