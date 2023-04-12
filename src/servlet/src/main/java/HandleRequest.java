
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HandleRequest extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("username");

        out.println("<html><body>");
        out.println("<h1>Welcome </h1>" + name);
        out.println("</body></html>");

        out.close();

    }

}
