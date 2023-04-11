
import java.io.*;
import javax.servlet.*;

public class ServletByImplements implements Servlet {

    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Initialization complete");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello world by implementing servlet</h1>");
        out.println("</body></html>");
        out.close();
    }

    @Override
    public String getServletInfo() {
        return "A Demo program written by Chaitanya";

    }

    @Override
    public void destroy() {
        System.out.println("servlet life cycle finished");

    }
}
