package ood.menu;

public class SomeAction implements  Action {
    private final String number;

    public SomeAction(String number) {
        this.number = number;
    }

    @Override
    public String action() {
        return "Задача " + number + " что-то сделала";
    }
}
