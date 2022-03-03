package servision.servlet; /**
 * @author ArvikV
 * @version 1.0
 * @since 19.01.2022
 */

import servision.model.Cat;
import servision.store.TodoStore;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatServlet", value = "/catservlet")
public class CatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cat> catList = TodoStore.instOf().readAllCategories();
        request.setAttribute("allCategories", catList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
