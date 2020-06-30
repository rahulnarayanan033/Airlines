<%-- 
    Document   : flight_detail
    Created on : 19 Jan, 2020, 11:52:33 AM
    Author     : rahul
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <style>
            body{
                background: url("planefront.jpg");
                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
            }
            table{
                height:40px;
                width: 700px;
            }
            #t1,#t2{
                background-color: white;
            }
            .delete,.update{
                border-color: red;
                background-color: white;
                width:60px;
                height: 40px;
                border-radius: 5px;
            }
            .delete:hover{
                background-color: red;
            }
            .update:hover{
                background-color: red;
            }
            #add{
                border-color: black;
                background-color: red;
                width:60px;
                height: 40px;
                border-radius: 5px;
            }
        </style>
   
    </head>
    <body>
        <%
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from flight");
                out.println("<center>");
                    out.println("<table cellpadding='20'>");
                    out.println("<tr id='t1'><th>Flight ID</th><th>Flight Name</th><th>From</th><th>Dep Time</th><th>To</th><th>Arr Time</th><th>Duration</th><th>Price</th><th></th><th></th></tr>");
                    while(rs.next())
                    {
                        %>
    <tr id="t2">
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2) %></td>
                        <td><%=rs.getString(7) %></td>
                        <td><%=rs.getString(3) %></td>
                        <td><%=rs.getString(8) %></td>
                        <td><%=rs.getString(4) %></td>
                        <td><%=rs.getString(5) %></td>
                        <td><%=rs.getString(6) %></td>
                        <td><a href="delete.jsp?id=<%=rs.getString(1)%>"><button type="button" class="delete">Delete</button></a></td>
                       
                        <td><a href="update.jsp?id=<%=rs.getString("id")%>"><button type="button" class="update">update</button></td>
</tr>
<%                    }
                    out.println("</center>");
                    
                    
            }  
            catch(Exception e)
            {
                
            }
                          
                    
            
            
        %>
        <br>
        <br>
        <center><a href='add.jsp'><input type="button" id="add" value="Add"></a></center>
    </body>
</html>
