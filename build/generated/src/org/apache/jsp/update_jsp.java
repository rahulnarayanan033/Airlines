package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: url(\"plane.jpg\");\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                background-color: \"white\";\n");
      out.write("            }\n");
      out.write("            .addflight{\n");
      out.write("                margin-top: 100px;\n");
      out.write("                margin-left: 420px;\n");
      out.write("                background-color: white;\n");
      out.write("                width: 500px;\n");
      out.write("                height:420px;\n");
      out.write("            }\n");
      out.write("            #id,#from,#to,#flname,#dep,#arr,#dur,#price{\n");
      out.write("                padding:5px;\n");
      out.write("                margin-left: 50px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: 1px solid red;\n");
      out.write("                background: transparent;\n");
      out.write("                width: 200px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            #sub{\n");
      out.write("                border-color: red;\n");
      out.write("                background-color: white;\n");
      out.write("                width:60px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            #sub:hover{\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"update.jsp\" method=\"post\">\n");
      out.write("        <label>Flight ID</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"id\" id=\"id\"><br><br>\n");
      out.write("            <label>From</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"from\" id=\"from\"><br><br>\n");
      out.write("            <label>To</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"to\" id=\"to\"><br><br>\n");
      out.write("            <label>Flight Name</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"flname\" id=\"flname\"><br><br>\n");
      out.write("            <label>Dep Time</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"dep\" id=\"dep\"><br><br>\n");
      out.write("            <label>Arr time</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"arr\" id=\"arr\"><br><br>\n");
      out.write("            <label>Duration</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"dur\" id=\"dur\"><br><br>\n");
      out.write("            <label>Price</label>&emsp;&emsp;&emsp;&emsp;<input type=\"text\" name=\"price\" id=\"price\"><br><br>\n");
      out.write("            <input type=\"submit\" name=\"sub\" id=\"sub\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("        ");

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
        
      out.write("\n");
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
