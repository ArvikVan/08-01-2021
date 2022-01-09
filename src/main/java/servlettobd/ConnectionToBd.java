package servlettobd;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.01.2022
 */
public class ConnectionToBd {
    public static void main(String[] args) {
        Store store = BdStore.instOf();
        store.addToBd(new Item("Ivan", "Password"));
    }
}
