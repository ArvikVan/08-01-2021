package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ArvikV
 * @version 1.0
 * @since 05.01.2022
 */
@WebServlet(urlPatterns = {"/cinema", "/cinema/*"})
public class CinServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method INIT() STARTING");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("METHOD SERVICE() START\n");
        super.service(req, resp);
        resp.getWriter().write("METHOD SERVICE() EXIT\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uri = req.getRequestURI();
        String param = req.getParameter("place");
        String seat = String.valueOf(param.charAt(1));
        String row = String.valueOf(param.charAt(0));
        resp.getWriter().write("String uri = req.getRequestURI(); => " + uri + "\n"
                + "String param = req.getParameter(\"place\"); => " + param + "\n"
                + "SEAT => " + seat + "\n"
                + "ROW => " + row + "\n");
    }
}
