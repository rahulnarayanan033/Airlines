package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\n");
      out.write("                background: purple;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                width:100px;\n");
      out.write("                height:100px;\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                margin-left:50px;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 24px;\n");
      out.write("                 \n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("                margin-left:50px;\n");
      out.write("                color: black;\n");
      out.write("                width:70px;\n");
      out.write("                height:40px;\n");
      out.write("            }\n");
      out.write("            .payment{\n");
      out.write("                background-color: white;\n");
      out.write("                margin-left: 370px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                width:750px;\n");
      out.write("                height:550px;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("            #cardno,#cardv,#cardname{\n");
      out.write("                padding:10px;\n");
      out.write("                margin-left: 70px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: 1px solid red;\n");
      out.write("                background: transparent;\n");
      out.write("                width: 300px;\n");
      out.write("                height:100px;\n");
      out.write("                color:black;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            #pay{\n");
      out.write("                width:250px;\n");
      out.write("                height:50px;\n");
      out.write("                border-radius:20px; \n");
      out.write("                margin-left:60px;\n");
      out.write("                background: purple;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"payment\">\n");
      out.write("        <center>\n");
      out.write("            <input placeholder=\"ACCOUNT NO.\" TYPE=\"text\" pattern=\"[0-9]{16}\" title=\"Enter valid account number\" id=\"cardno\" name=\"cardno\"><br><br><br><br>\n");
      out.write("        <label>Select Month:</label><select><option value=\"01\">01</option><option value=\"02\">02</option><option value=\"03\">04</option><option value=\"05\">05</option><option value=\"06\">06</option><option value=\"07\">07</option><option value=\"08\">08</option><option value=\"09\">09</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option></select>&nbsp;&nbsp;\n");
      out.write("        <label>Select Year:</label><select><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">27</option><option value=\"28\">28</option></select>&nbsp;&nbsp;\n");
      out.write("        <input placeholder=\"CVV\" type=\"text\" pattern=\"[0-9]{3}\" title=\"Enter valid cvv\" id=\"cardv\" name=\"cardv\"><br><br>\n");
      out.write("        <input placeholder=\"CARDHOLDER NAME.\" pattern=\"[a-zA-Z]\" title=\"Enter valid name\" type=\"text\" id=\"cardname\" name=\"cardname\"><br><br><br>\n");
      out.write("        <a href=\"print.jsp\"><input type=\"button\" id=\"pay\" value=\"Pay Now\"></a>\n");
      out.write("        </center>\n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    ");

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
                
                 //Integer i = se.getAttribute("no");
                //int in = i.intValue();
                //String price = rs.getString(6);
                }
         }
         catch(Exception e)
         {
             out.println(e);
         }
                
    
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
