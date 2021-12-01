package thread.repeat;

/**
 * @author ArvikV
 * @version 1.0
 * @since 01.12.2021
 */
public class Wget {
    public static void main(String[] args) {
        Thread load = new Thread(
                () -> {
                    try {
                        for (int index = 0; index < 100; index++) {
                            System.out.print("\rLoading...: " + index + "%");
                            Thread.sleep(500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
        load.start();

    }
}
