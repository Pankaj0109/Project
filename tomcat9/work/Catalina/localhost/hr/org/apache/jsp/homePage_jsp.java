/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-02-24 07:12:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>\r\n");
      out.write("    </title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/postBox.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "myHeader.jsp", out, false);
      out.write("\r\n");
      out.write("    <!--body section-->\r\n");
      out.write("    <div class=\"container-fluid\" id=\"homePage\" style=\"display: block;\">\r\n");
      out.write("      <div class=\"row\" style=\"margin-top: 30px;\" id=\"body\">\r\n");
      out.write("        <marquee direction=\"up\" class=\"col-sm-2\" style=\"background-color: green;height: 300px\" onmouseover=\"this.stop()\" onmouseout=\"this.start()\">\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"container\" style=\"min-height: 50px;background-color:yellow\">\r\n");
      out.write("              <a style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black;background-color: white\">\r\n");
      out.write("            <a href=\"\" style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black;background-color: yellow\">\r\n");
      out.write("            <a href=\"\" style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black;background-color: yellow\">\r\n");
      out.write("            <a href=\"\" style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black;background-color: yellow\">\r\n");
      out.write("            <a href=\"\" style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black;background-color: yellow\">\r\n");
      out.write("            <a href=\"\" style=\"word-wrap: break-word;\">what is java programming language ?and what are the oops concept\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </marquee>\r\n");
      out.write("        <div class=\"col-sm-7\" style=\"background-color: #45efc5;min-height: 500px;\">\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-2\" style=\"height:auto;background-color: #f7f8fc\">\r\n");
      out.write("              <CENTER>\r\n");
      out.write("                <img src=\"abc.jpg\" style=\"height: 8rem;width: 8rem;\" class=\"rounded img-fluid\">\r\n");
      out.write("              </CENTER>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-10\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("              <h6 style=\"width: 100%;word-wrap: break-word;\">ebfeeawQLKJDBWAHSJFNKAMDWLFEKSNFKDWMLFEMSKBDNKFSAWML,EFMKNJEKDWMLQEFKRNJNKWQMLWDEFKNRJBGFENKDWMLQEFKN\r\n");
      out.write("              </h6>\r\n");
      out.write("              <P style=\"width: 100%;word-wrap: break-word;margin-top: 3px\"> this is i love u this is i love this is i love u this is i love u this is i love u this is i love u this is i love u\r\n");
      out.write("              </P>\r\n");
      out.write("              <a href=\"\">read more...\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-2\" style=\"height:auto;background-color: #f7f8fc\">\r\n");
      out.write("              <CENTER>\r\n");
      out.write("                <img src=\"abc.jpg\" style=\"height: 8rem;width: 8rem;\" class=\"rounded img-fluid\">\r\n");
      out.write("              </CENTER>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-10\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("              <h6 style=\"width: 100%;word-wrap: break-word;\">ebfeeawQLKJDBWAHSJFNKAMDWLFEKSNFKDWMLFEMSKBDNKFSAWML,EFMKNJEKDWMLQEFKRNJNKWQMLWDEFKNRJBGFENKDWMLQEFKN\r\n");
      out.write("              </h6>\r\n");
      out.write("              <P style=\"width: 100%;word-wrap: break-word;margin-top: 3px\"> this is i \r\n");
      out.write("              </P>\r\n");
      out.write("              <a href='/hr/postDetails.jsp'>read more..A.\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-3\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-9\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-3\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-9\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-3\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-9\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-3\" style=\"background-color: #6376f2\">\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-3\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-9\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\" style=\"border: 1px solid black\">\r\n");
      out.write("            <div class=\"col-sm-3\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-9\" style=\"min-height: 50px;background-color: #f7f8fc\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"space\" style=\"min-height: 5px\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--body section-->\r\n");
      out.write("    <!-- Footer section add later -->\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
