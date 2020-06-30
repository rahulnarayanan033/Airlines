<%-- 
    Document   : search
    Created on : Jan 14, 2020, 8:44:45 PM
    Author     : ADMIN
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
                background:url("china.jpg");
                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;   
            }
            table{
                height:40px;
                width: 700px;
                border-color: white;
            }
            #t1,#t2{
                background-color: white;
            }
            #bk{
                border-radius: 5px;
                width: 60px;
                height:40px;
                background-color: white;
                border-color: red;
            }
            #bk:hover{
                color:white;
                background-color: red;
            }
        </style>
    </head>
    <body>
        
        
        <% 
            String from = request.getParameter("from");
            String dest = request.getParameter("dest");
            String date = request.getParameter("date");
            String adult = request.getParameter("no");
            
            HttpSession se = request.getSession(false);
            
            if(se!=null)
            {
                se.setAttribute("from",from);
                se.setAttribute("dest",dest);
                se.setAttribute("date",date);
                se.setAttribute("adu", adult);
                
            }
            
            //out.println("<a href='print.jsp' onClick='se.setAttribute('adu',adult)'>Session</a>");
           
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                
                
                Statement st = con.createStatement();
                if(from.equals(dest))
                {
                    out.println("No same place");
                }
                else{
                ResultSet rs = st.executeQuery("select * from flight where origin='"+from+"'and dest='"+dest+"'");
                out.println("<center>");
                out.println("<table cellpadding='20'>");
                    out.println("<tr id='t1'><th>Flight ID</th>&emsp;&emsp;&emsp;<th>Flight Name</th><th>From</th><th>Dep Time</th><th>To</th><th>Arr Time</th><th>Duration</th><th>Price</th><th></th></tr>");
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
                        <td><a href="bill.jsp?id=<%=rs.getString(1)%>"><button type="button" id="bk" class="delete">Book</button></a></td>
    </tr>
                    
                    <%
                   
                    
                }
out.println("</center>");
                

                con.close();
}
}
            catch(Exception e)
            {
                out.println(e);
            }
        %>
    </body>
</html>
