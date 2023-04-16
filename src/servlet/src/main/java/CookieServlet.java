package servlet.src.main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();

        String name = req.getParameter("username");

        Cookie ck = new Cookie("name", name);
        out.println("<h1>Welcome " + name+"<br />") ;
        out.println("<a href='CookieServletSec' >Go to another page</a>");


//out.println("<form action='./CookieServletSec' method='post'> <button type='submit'>Go</button> </form>");

        res.addCookie(ck);

        out.close();
    }
}