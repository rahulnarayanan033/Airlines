package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class flight_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <style>\n");
      out.write("            body{\n");
      out.write("                background: url(\"planefront.jpg\");\n");
      out.write("                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                height:40px;\n");
      out.write("                width: 700px;\n");
      out.write("            }\n");
      out.write("            #t1,#t2{\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            .delete,.update{\n");
      out.write("                border-color: red;\n");
      out.write("                background-color: white;\n");
      out.write("                width:60px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .delete:hover{\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("            .update:hover{\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("            #add{\n");
      out.write("                border-color: black;\n");
      out.write("                background-color: red;\n");
      out.write("                width:60px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
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
                        
      out.write("\n");
      out.write("    <tr id=\"t2\">\n");
      out.write("                        <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(2) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(7) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(3) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(8) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(4) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(5) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(6) );
      out.write("</td>\n");
      out.write("                        <td><a href=\"delete.jsp?id=");
      out.print(rs.getString(1));
      out.write("\"><button type=\"button\" class=\"delete\">Delete</button></a></td>\n");
      out.write("                       \n");
      out.write("                        <td><a href=\"update.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\"><button type=\"button\" class=\"update\">update</button></td>\n");
      out.write("</tr>\n");
                    }
                    out.println("</center>");
                    
                    
            }  
            catch(Exception e)
            {
                
            }
                          
                    
            
            
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <center><a href='add.jsp'><input type=\"button\" id=\"add\" value=\"Add\"></a></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
