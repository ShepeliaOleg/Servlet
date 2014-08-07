package firstServer;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by New on 27.07.14.
 */
public class IPAuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String ip = "127.0.0.1";
        String ip1 = "0:0:0:0:0:0:0:1";
        String ip2 = "192.168.7.3";
        if (servletRequest.getRemoteAddr().equals(ip1) || servletRequest.equals(ip2)){
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            PrintWriter printWriter =servletResponse.getWriter();
            printWriter.print("<html>");
            printWriter.print("Error");
            printWriter.print("</html>");
        }
    }

    @Override
    public void destroy() {

    }
}
