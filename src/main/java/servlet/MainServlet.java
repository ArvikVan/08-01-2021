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
 * @since 04.01.2022
 */
@WebServlet(urlPatterns = {"/first", "/first/*"})
public class MainServlet extends HttpServlet {
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
        String uri = req.getRequestURI();
        String parameterMap = formatParams(req);
        resp.getWriter().write("METHOD doGET() RUNNING\n "
                + "String uri = req.getRequestURI(); => " + uri + "\nParams: \n" + parameterMap + "\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String parameterMap = formatParams(req);
        resp.getWriter().write("METHOD doPOST() RUNNING\n "
                + "String uri = req.getRequestURI(); => " + uri + "\nParams: \n" + parameterMap + "\n");
    }

    private String formatParams(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet().stream()
                .map(entry -> {
                    String param = String.join(" AND ", entry.getValue());
                    return entry.getKey() + " => " + param;
                })
                .collect(Collectors.joining("\n"));
    }

    @Override
    public void destroy() {
        super.destroy();
        log("Method DESTROY() STARTING");
    }
}
