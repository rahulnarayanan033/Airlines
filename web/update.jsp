<%-- 
    Document   : update
    Created on : 20 Jan, 2020, 5:56:34 PM
    Author     : rahul
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background: url("plane.jpg");
            }
            label
            {
                background-color: "white";
            }
            .updateflight{
                margin-top: 100px;
                margin-left: 420px;
                background-color: white;
                width: 500px;
                height:420px;
            }
            #id,#from,#to,#flname,#dep,#arr,#dur,#price{
                padding:5px;
                margin-left: 50px;
                outline: none;
                border: none;
                border-bottom: 1px solid red;
                background: transparent;
                width: 200px;
                color: black;
            }
            #sub{
                border-color: red;
                background-color: white;
                width:60px;
                height: 40px;
                border-radius: 5px;
            }
            #sub:hover{
                background-color: red;
            }
        </style>
    </head>
    <body>
        <div class="updateflight">
        <form action="update.jsp" method="post">
        &emsp;&emsp;<label>Flight ID</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="id" id="id"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>From</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="from" id="from"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>To</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="to" id="to"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>Flight Name</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="flname" id="flname"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>Dep Time</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="dep" id="dep"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>Arr time</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="arr" id="arr"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>Duration</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="dur" id="dur"><br><br>
            &emsp;&emsp;&emsp;&emsp;<label>Price</label>&emsp;&emsp;&emsp;&emsp;<input type="text" name="price" id="price"><br><br>
            <center><input type="submit" name="sub" id="sub" value="Update"></center>
        </form>
        </div>
        <%
            String id = request.getParameter("id");
            String from = request.getParameter("from");
             String to = request.getParameter("to");
             String flname = request.getParameter("flname");
             String deptime = request.getParameter("dep");
             String arrtime = request.getParameter("arr");
             String dur = request.getParameter("dur");
             String price = request.getParameter("price");
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                PreparedStatement ps = con.prepareStatement("update flight set id=?,flname=?,dep_time=?,arr_time=?,duration=?,price=?,origin=?,dest=? where id="+id);
                ps.setString(1,id);
                ps.setString(7,from);
                ps.setString(8,to);
                ps.setString(2,flname);
                ps.setString(3,deptime);
                ps.setString(4,arrtime);
                ps.setString(5, dur);
                ps.setString(6, price);
                ps.executeUpdate();
        }
        catch(Exception e)
        {
            out.println(e);
        }
        %>
    </body>
</html>
