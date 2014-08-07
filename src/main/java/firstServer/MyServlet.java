package firstServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by New on 26.07.14.
 */
public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.print("<html><body>");

        out.print("<form name=\"input\" action=\"/project/path\" method=\"POST\">\n" +
                "Username: <input type=\"text\" name=\"user\">\n" +
                "<input type=\"submit\" value=\"Submit\">\n" +
                "</form> " +
                "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);

        String user = req.getParameter("user");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print(user);
        printWriter.println(req.getLocalPort());
        printWriter.println(req.getSession());



    }
}
