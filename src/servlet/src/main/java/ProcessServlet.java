package servlet.src.main.java;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ProcessServlet  extends HttpServlet{

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int id = Integer.parseInt(req.getParameter("id"));
        String name =  req.getParameter("name");
        String address = req.getParameter("address");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "ankitbhusal20");

            PreparedStatement pst = conn.prepareStatement("insert into users(id, name, address) values(?, ?, ?)");

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, address);

            int a = pst.executeUpdate();

            out.println(a +" Row is inserted into db");

            pst.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
