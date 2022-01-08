package coockies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ArvikV
 * @version 1.0
 * @since 08.01.2022
 */
@WebServlet(urlPatterns = "/set-cookies")
public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "123");
        Cookie cookie2 = new Cookie("some_name", "Thomas");
        cookie.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
