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
import java.util.List;

@WebServlet(name = "ItemServlet", value = "/ItemServlet")
public class ItemServlet extends HttpServlet {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String json = GSON.toJson(BdStore.instOf().findAll());
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("application/json; charset=utf-8");
        OutputStream output = response.getOutputStream();
        output.write(json.getBytes(StandardCharsets.UTF_8));
        output.flush();
        output.close();
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Item item = GSON.fromJson(request.getReader(), Item.class);
        item.addCategory((Category) request.getAttribute("cat"));
        int id = Integer.parseInt(request.getParameter("id"));
        BdStore.instOf().addToBd(item);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
