<%-- 
    Document   : admin
    Created on : 19 Jan, 2020, 11:36:38 AM
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
            String user = request.getParameter("txtuser");
            String pwd = request.getParameter("txtpwd");
            //String user1="";
            //String pwd1="";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from admin where username='"+user+"'and password='"+pwd+"'");
                if(rs.next())
                {
                    response.sendRedirect("flight_detail.jsp");
                }
                else
                {
                    response.sendRedirect("admin.html");
                    out.println("Wrong pas");
                }
            }
            
            catch(Exception e)
            {
                out.println(e);
            }
            
            
            %>
    </body>
</html>