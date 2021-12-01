package thread.repeat;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.12.2021
 */
public class ThreadState {
    public static void main(String[] args) {
        Thread first = new Thread(
                () -> {

                }
        );
        System.out.println("first.getState() " + first.getState());
        first.start();
        System.out.println("first.getState() "  + first.getState());
        while (first.getState() != Thread.State.TERMINATED) {
            System.out.println("first.getState() " + first.getState());
        }
        System.out.println("first.getState() " + first.getState());

        Thread second = new Thread(
                () -> {

                }
        );
        System.out.println("second.getState() " + second.getState());
        second.start();
        System.out.println("second.getState() " + second.getState());
        while (second.getState() != Thread.State.TERMINATED) {
            System.out.println("second.getState() " + second.getState());
        }
        System.out.println("second.getState() " + second.getState());

    }
}
