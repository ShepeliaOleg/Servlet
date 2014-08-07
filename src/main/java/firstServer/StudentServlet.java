package firstServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by New on 26.07.14.
 */
public class StudentServlet extends HttpServlet{

    static List <String> students = new ArrayList<String>();

    @Override
    public void init() throws ServletException {
        if (students.isEmpty()){
            students.add("student1");
            students.add("student2");
            students.add("student3");
            students.add("student4");
            students.add("student5");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        Iterator <String> iterator= students.iterator();

        writer.print("<html><body>");
        while (iterator.hasNext()){
            writer.println("<ul><li>"+ iterator.next() + "</li></ul>");
        }

        writer.println("<form  method=\"post\">\n" +
                "    <input type=\"name\" name=\"student\">\n" +
                "    <input type=\"submit\" value=\"Add\">\n" +
                "</form>");
        writer.println("<form method= \"delete\"\n> " +
                "    <input type=\"number\" name=\"studentDelete\">\n" +
                "<input type=\"submit\" value=\"Delete\">\n" +
                "</form>");
        writer.println(students.size());
        writer.print("<br/><img src=\"image.jpg\">");
        writer.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        students.add(req.getParameter("student"));
       resp.sendRedirect("/student");
        //req.getRequestDispatcher("/student").forward(req,resp);

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //int i = Integer.valueOf(req.getParameter("studentDelete"));
        students.get(1);
        resp.sendRedirect("/student");
    }


}
