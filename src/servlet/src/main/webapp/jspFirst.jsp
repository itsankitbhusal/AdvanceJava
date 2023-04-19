<%--
    Document   : jspFirst
    Created on : Apr 18, 2023, 12:27:39 PM
    Author     : ankitbh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--Scriptlet tags-->
        <%
            out.println("My first app");
        %>
        <!--Declaration tag-->
        <%!
            int cube(int x) {
                return x * x * x;
            }
        %>
        <%
            int number = cube(2);
        %>
        <!--Expression tags-->
        <%= number%>
    </body>
</html>
