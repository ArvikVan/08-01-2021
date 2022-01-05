package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.01.2022
 */
public class TelNet {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("search.maven.org", 80);

        InputStream response = socket.getInputStream();
        OutputStream request = socket.getOutputStream();

        byte[] bytes = ("GET /solrsearch/select?q=guice&rows=22&wt=json HTTP/1.1\n"
                + "Host: search.maven.org\n\n").getBytes();

        request.write(bytes);

        int c;

        while ((c = response.read()) != -1) {
            System.out.print((char) c);
        }

        socket.close();
    }
}
