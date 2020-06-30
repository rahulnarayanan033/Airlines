<%-- 
    Document   : delete
    Created on : 20 Jan, 2020, 12:00:15 AM
    Author     : rahul
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% 
        String id = request.getParameter("id");
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                Statement st=con.createStatement();
                st.executeUpdate("delete from flight where id="+id);
                
        }
        catch(Exception e)
        {
            out.println(e);
        }
     %>
    </body>
</html>
