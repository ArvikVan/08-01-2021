package servision.servlet; /**
 * @author ArvikV
 * @version 1.0
 * @since 19.01.2022
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import servision.model.Cat;
import servision.model.Item;
import servision.store.TodoStore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/indexServ")
public class IndexServlet extends HttpServlet {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("items", TodoStore.instOf().readItem());
        String json = GSON.toJson(TodoStore.instOf().readItem());
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
        request.setCharacterEncoding("utf-8");
        String description = request.getParameter("description");
        Date created = Timestamp.valueOf(LocalDateTime.now());
        List<Cat> catList = TodoStore.instOf().readAllCategories();
        Item item = new Item(description, created, catList);
        TodoStore.instOf().createItem(item);
        doGet(request, response);
    }
}
