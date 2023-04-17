package servlet.src.main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServletSec extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false);

        String value = (String) session.getAttribute("un");

        out.write("Welcome session: " + value);

        out.close();
    }

}
