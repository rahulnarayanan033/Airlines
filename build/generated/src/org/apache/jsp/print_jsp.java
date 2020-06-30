package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class print_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                background-color:lightblue;\n");
      out.write("                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;\n");
      out.write("            }\n");
      out.write("            .print{\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("                margin-left: 300px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                width:700px;\n");
      out.write("                height:520px;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                color:black;\n");
      out.write("                font-size: 20px; \n");
      out.write("                padding:0px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                margin-left: 0px;\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                background: transparent;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 700px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"print\">\n");
      out.write("        ");

            HttpSession se = request.getSession();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"0\" cellpadding=\"15\"> \n");
      out.write("            <tr>\n");
      out.write("                <td>Flight ID:</td><td>");
      out.print(se.getAttribute("id"));
      out.write(" </td>\n");
      out.write("                <td>Flight name:</td><td>");
      out.print(se.getAttribute("flname"));
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>From:</td><td>");
      out.print(se.getAttribute("from"));
      out.write("</td>\n");
      out.write("                <td>To:</td><td>");
      out.print(se.getAttribute("dest"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Dep Time</td><td>");
      out.print(se.getAttribute("dep"));
      out.write("</td>\n");
      out.write("                <td>Arr Time</td><td>");
      out.print(se.getAttribute("arr"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Duration:</td><td>");
      out.print(se.getAttribute("dur"));
      out.write("</td>\n");
      out.write("                <td>Travelers:</td><td>");
      out.print(se.getAttribute("adu"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date:</td></td><td>");
      out.print(se.getAttribute("date"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Price:</td><td>");
      out.print(se.getAttribute("price"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Payment Status:</td><td>Payment Successfull</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
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
