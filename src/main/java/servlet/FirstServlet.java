package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ArvikV
 * @version 1.0
 * @since 08.01.2022
 */
@WebServlet(urlPatterns = "/first-servlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    /**
     *
     * @param req запрос
     * @param resp ответ
     * @throws ServletException исключение
     * @throws IOException исключение
     * реквест, это все что приходит от пользователя/клиента
     * сендредирект используется для перехода на сторонние ресурсы, делает два запроса на сервер и только потом
     * форвад используется для перехода внутри сервера, делает это быстро, быстрее сендредиректа
     * Session - так как stateless т.е. не хранит информации о клиенте, то усипользуем сессии в которых будем
     * хранить инфу о каждом пользователе обратившимся в сессию
     *
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        String name = req.getParameter("name");

        int quantity = Integer.parseInt(req.getParameter("quantity"));
        if (cart == null) {
            cart = new Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);

        /*Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }
        *//*String name = req.getParameter("name");
        String surname = req.getParameter("surname");*//*
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        *//*printWriter.println("<h1>HELLO -  "  + name + "</h1>");
        printWriter.println("<h1>HELLO -  "  + surname + "</h1>");*//*
        printWriter.println("<h1>YOUR COUNT IS => WITH SESSION --" + count + "-- </h1>");
        printWriter.println("</html>");
        //resp.sendRedirect("https://www.google.com");
        //resp.sendRedirect("/08_01_2021/test-jsp.jsp");

        //req.getRequestDispatcher("/test-jsp.jsp").forward(req, resp);*/
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);
    }
}
