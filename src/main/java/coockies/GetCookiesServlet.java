package coockies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ArvikV
 * @version 1.0
 * @since 08.01.2022
 */
@WebServlet(urlPatterns = "/get-cookies")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies(); //получаем куки от пользователя/клиента
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        for (Cookie cookie : cookies) {
            printWriter.println("<h1>" + cookie.getName() + ":" + cookie.getValue() + "</h1>");
        }
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
