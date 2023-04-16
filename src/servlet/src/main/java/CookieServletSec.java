package servlet.src.main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServletSec extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Cookie ck[] = req.getCookies();

        out.println("<h1>Welcome " + ck[0].getValue());

        out.close();
    }

}
