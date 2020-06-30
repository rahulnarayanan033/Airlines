<%-- 
    Document   : user
    Created on : 20 Jan, 2020, 2:01:25 AM
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
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from registeration");
                out.println("<table padding='20'>");
                while(rs.next())
                {
                    out.println("<tr><td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td></tr>");
                }
                out.println("</table>");
            }
            catch(Exception e)
            {
                
            }
        %>
    </body>
</html>
