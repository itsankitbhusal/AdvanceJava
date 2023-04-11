import java.io.*;
import javax.servlet.*;

public class FirstGenericServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.print("<html><body>");
        out.print("<h1>Hello world from my first generic servlet web application</h1>");
        out.print("</body></html>");

    }
}
