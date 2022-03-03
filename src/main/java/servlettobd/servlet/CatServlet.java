package servlettobd.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import servlettobd.BdStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author ArvikV
 * @version 1.0
 * @since 17.01.2022
 */
@WebServlet(urlPatterns = "/category")
public class CatServlet extends HttpServlet {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json; charset=utf-8");
        OutputStream output = response.getOutputStream();
        String json = GSON.toJson(BdStore.instOf().findAllCategory());
        output.write(json.getBytes(StandardCharsets.UTF_8));
        output.flush();
        output.close();
    }
}
