<%-- 
    Document   : bill
    Created on : 21 Jan, 2020, 3:03:50 PM
    Author     : rahul
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            
            body{
                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                background: purple;
                background-repeat: no-repeat;
                width:100px;
                height:100px;
               
                
            }
            label{
                margin-left:50px;
                color: black;
                font-size: 24px;
                 
            }
            select{
                margin-left:50px;
                color: black;
                width:70px;
                height:40px;
            }
            .payment{
                background-color: white;
                margin-left: 370px;
                margin-top: 80px;
                width:750px;
                height:580px;
                border:none;
            }
            #cardno,#cardv,#cardname{
                padding:10px;
                margin-left: 70px;
                outline: none;
                border: none;
                border-bottom: 1px solid red;
                background: transparent;
                width: 300px;
                height:100px;
                color:black;
                font-size: 20px;
            }
            #pay{
                width:250px;
                height:50px;
                border-radius:20px; 
                margin-left:60px;
                background: purple;
                color: white;
                font-size: 20px; 
            }
        </style>
    </head>
    <body>
        
        <div class="payment">
        <center>
            <input placeholder="ACCOUNT NO." TYPE="text" pattern="[0-9]{16}" title="Enter valid account number" id="cardno" name="cardno"><br><br><br><br>
        <label>Select Month:</label><select><option value="01">01</option><option value="02">02</option><option value="03">04</option><option value="05">05</option><option value="06">06</option><option value="07">07</option><option value="08">08</option><option value="09">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select>&nbsp;&nbsp;
        <label>Select Year:</label><select><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option></select>&nbsp;&nbsp;
        <input placeholder="CVV" type="password" pattern="[0-9]{3}" title="Enter valid cvv" id="cardv" name="cardv"><br><br>
        <input placeholder="CARDHOLDER NAME." pattern="[a-zA-Z]" title="Enter valid name" type="text" id="cardname" name="cardname"><br><br><br>
        <a href="print.jsp"><input type="button" id="pay" value="Pay Now"></a>
        </center>
        </div>    
        
    </body>
    <%
        HttpSession se = request.getSession(false);
        String id = request.getParameter("id");
        String no = request.getParameter("cardno");
        String cvv = request.getParameter("cardv");
        String cname = request.getParameter("cardname");
         try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
                if(no.equals("") || cvv.equals("")||cname.equals("")){
                    response.sendRedirect("bill.jsp");
                }
                else{
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from flight where id="+id);
                
                
                while(rs.next())
                {
                    String id1 = rs.getString(1);
                    se.setAttribute("id", id1);
                    String flname = rs.getString(2);
                    se.setAttribute("flname", flname);
                    String dep = rs.getString(3);
                    se.setAttribute("dep", dep);
                    String arr = rs.getString(4);
                    se.setAttribute("arr", arr);
                    String dur = rs.getString(5);
                    se.setAttribute("dur", dur);
                    
                    
                }
                
                 
                }
         }
         catch(Exception e)
         {
             out.println(e);
         }
                
    %>
</html>

