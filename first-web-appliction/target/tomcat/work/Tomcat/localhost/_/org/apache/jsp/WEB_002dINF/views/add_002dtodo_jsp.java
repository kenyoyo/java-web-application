/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-21 00:29:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dtodo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navigation.jspf", Long.valueOf(1540081517216L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jspf", Long.valueOf(1540081327845L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jspf", Long.valueOf(1540081383917L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Todo</title>\r\n");
      out.write("<!--  Bootstrap core CSS -->\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\tbackground-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"\">\r\n");
      out.write("\t\t<a href=\"/\" class=\"navbar-brand\">Brand</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar-collapse\">\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/list-todos.do\">Todos</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"https://github.com/kenyoyo\">MyGit</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t<li><a href=\"/logout.do\">Logout</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\tYour New Action Item:\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"POST\" action=\"/add-todo.do\">\r\n");
      out.write("\t\t<fieldset class=\"form-group\">\r\n");
      out.write("\t\t\t<label>Description</label> <input name=\"todo\" type=\"text\"\r\n");
      out.write("\t\t\t\tclass=\"form-control\" /> <br>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<fieldset class=\"form-group\">\r\n");
      out.write("\t\t\t<label>Category</label> <input name=\"category\" type=\"text\"\r\n");
      out.write("\t\t\t\tclass=\"form-control\" /> <br>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<input name=\"add\" type=\"submit\" class=\"btn btn-success\" value=\"Submit\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("\t\t<p>footer content</p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
