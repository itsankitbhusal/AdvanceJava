package servlet.src.main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();

        String name = req.getParameter("username");
        System.out.println("Hello " + name);

        HttpSession session = req.getSession();

        session.setAttribute("un", name);

        out.println("<a href='SessionServletSec'>Go to another page</a>");


        out.close();
    }
}