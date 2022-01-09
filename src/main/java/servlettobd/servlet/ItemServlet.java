package servlettobd.servlet; /**
 * @author ArvikV
 * @version 1.0
 * @since 09.01.2022
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import servlettobd.BdStore;
import servlettobd.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ItemServlet", value = "/ItemServlet")
public class ItemServlet extends HttpServlet {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("password");
        BdStore.instOf().addToBd(new Item(name, pass));
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Item item = BdStore.instOf().findById(id);
        BdStore.instOf().deleteItem(item, id);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
