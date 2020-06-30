<%-- 
    Document   : print
    Created on : 21 Jan, 2020, 2:57:54 PM
    Author     : rahul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color:lightblue;
                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
            }
            .print{
                background-color: whitesmoke;
                margin-left: 300px;
                margin-top: 100px;
                width:700px;
                height:520px;
                border:none;
            }
            tr{
                color:black;
                font-size: 20px; 
                padding:0px;
                margin-bottom: 20px;
                margin-left: 0px;
                outline: none;
                border: none;
                background: transparent;
            }
            table{
                width: 700px;
            }
        </style>
    </head>
    <body>
        <div class="print">
        <%
            HttpSession se = request.getSession();
        %>
        
        <table border="0" cellpadding="15"> 
            <tr>
                <td>Flight ID:</td><td><%=se.getAttribute("id")%> </td>
                <td>Flight name:</td><td><%=se.getAttribute("flname")%> </td>
            </tr>
            <tr>
                <td>From:</td><td><%=se.getAttribute("from")%></td>
                <td>To:</td><td><%=se.getAttribute("dest")%></td>
            </tr>
            <tr>
                <td>Dep Time</td><td><%=se.getAttribute("dep")%></td>
                <td>Arr Time</td><td><%=se.getAttribute("arr")%></td>
            </tr>
            <tr>
                <td>Duration:</td><td><%=se.getAttribute("dur")%></td>
                <td>Travelers:</td><td><%=se.getAttribute("adu")%></td>
            </tr>
            <tr>
                <td>Date:</td></td><td><%=se.getAttribute("date")%></td>
            </tr>
            <tr>
                <td>Price:</td><td><%=se.getAttribute("price")%></td>
            </tr>
            <tr>
                <td>Payment Status:</td><td>Payment Successfull</td>
            </tr>
        </table>
        </div>
    </body>
</html>
