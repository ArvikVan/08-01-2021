package preptointerview;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.03.2022
 */
public class ThreadSynch {
    public static void main(String[] args) {

    }

    synchronized void doAll() {
        doFirst();
        doSecond();
    }

    synchronized void doFirst() {
        System.out.println("First operation is successful.");
    }

    synchronized void doSecond() {
        System.out.println("Second operation is successful.");
    }
}
