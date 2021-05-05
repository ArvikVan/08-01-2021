package collections.arraylist;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Tom");
        people.add("Kok");
        people.add("Duck");
        people.add("Dean");
        people.add("John");
        people.add("Elizabeth");
        System.out.println(people.get(1));
        people.set(1, "Karl");
        System.out.printf("ArrayList has %d elements", people.size());

        for (String person:people) {
            System.out.print("| " + person + " ");
        }
        if (people.contains("Elizabeth")) {
            System.out.println("Arraylist contain Elizabeth! ");
        }
        people.remove("Duck");
        people.remove(0);
        for (String person:people) {
            System.out.print("| " + person + " ");
        }
    }
}
