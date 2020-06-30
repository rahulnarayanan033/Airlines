<%-- 
    Document   : Login
    Created on : Jan 14, 2020, 2:10:09 PM
    Author     : ADMIN
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
            String  fname = request.getParameter("txtfname");
            String lname = request.getParameter("txtlname");
            String user = request.getParameter("txtuser");
            String pwd = request.getParameter("txtpwd");
            String cpwd = request.getParameter("txtcpwd");
            String mob = request.getParameter("txtmob");

            //HttpSession se = request.getSession(false);
            //se.setAttribute("fname", fname);
            //se.setAttribute("lname",lname);
            //se.setAttribute("mob",mob);
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                if(fname.equals("") || lname.equals("") || user.equals("") || pwd.equals("") || cpwd.equals("") || mob.equals("")){
                    out.println("Empty cells not allowed");
                }
                
                    
                
                else{
                PreparedStatement ps;
                ps = con.prepareStatement("insert into registeration values(?,?,?,?,?,?)");
                ps.setString(1,fname);
                ps.setString(2,lname);
                ps.setString(3,user);
                ps.setString(4, pwd);
                ps.setString(5,cpwd);
                ps.setString(6,mob);
                //Statement st = con.createStatement();
                //ResultSet rs = st.executeQuery("select * from login");
                ps.executeUpdate();
                String gh = "login.html";
                response.sendRedirect(gh);
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
            
            
            %>

    </body>
</html>
