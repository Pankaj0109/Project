/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-09-30 18:32:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--header-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  #collapse-target ul li a\r\n");
      out.write("  {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    font-family: verdana;\r\n");
      out.write("    font-style: italic;\r\n");
      out.write("    color: white;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write(" #collapse-target ul li a:hover\r\n");
      out.write("  {\r\n");
      out.write("    border-bottom: 2px solid red;\r\n");
      out.write("  }\r\n");
      out.write("  #collapse-target ul li a:active\r\n");
      out.write("  {\r\n");
      out.write("    background-color: white;\r\n");
      out.write("  }\r\n");
      out.write("  #collapse-target ul li\r\n");
      out.write("  {\r\n");
      out.write("  opacity: .9;\r\n");
      out.write("  color: black;\r\n");
      out.write("  }\r\n");
      out.write("  #collapse-target ul \r\n");
      out.write("  {\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"container-fluid row\">\r\n");
      out.write("  <div class=\"col-sm-7\">\r\n");
      out.write("    <img src=\"bg.jpg\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col-sm-3\" style=\"margin-bottom: 10px\">\r\n");
      out.write("    <form class=\"form-inline\" style=\"margin-top: 20%\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" id=\"vSearchBox\" onkeyup=\"javascript:searchThreads()\">\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--navbar-->\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm  navbar-dark sticky-top\" style=\"background-color: #4d1d7c;font-family: Montserrat, sans-serif;min-height: 80px;z-index: 9999;border-bottom: 1px solid black;font-size: 18px !important;letter-spacing: 2px;color: white\">\r\n");
      out.write("  <img src=\"skill-icon.png\">\r\n");
      out.write("\r\n");
      out.write("  <button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#collapse-target\" >\r\n");
      out.write("    <!--this button is to make the below division whose id is collpase-target .as responsive ..span is a icon shown when screeen collapse -->\r\n");
      out.write("    <span class=\"navbar-toggler-icon\">\r\n");
      out.write("    </span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapse-target\" style=\"margin-left: 30px\">\r\n");
      out.write("    \r\n");
      out.write("      ");

    if(session.getAttribute("email")==null)
      {
    
      out.write("\r\n");
      out.write("    <ul class=\"navbar-nav col-sm-8\">\r\n");
      out.write("    <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link active\" href=\"/skillshare/homePage.jsp\" style=\"\" >Home\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"navbar-nav  col-sm-2 \" style=\"\">\r\n");
      out.write("      <li class=\"nav-link\">\r\n");
      out.write("        <button style=\"background-color: #e80d65;color: white;cursor: pointer;\" data-toggle=\"modal\" data-target=\"#signInModal\" >Login\r\n");
      out.write("        </button>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li  class=\"nav-link\">\r\n");
      out.write("        <button style=\"background-color: #e80d65;color: white;cursor: pointer;\" data-toggle=\"modal\" data-target=\"#signUpModal\">SignUp\r\n");
      out.write("        </button>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    ");
}else{
      out.write("\r\n");
      out.write("     <ul class=\"navbar-nav col-sm-8\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link active\" href=\"/skillshare/homePage.jsp\" style=\"\" >Home\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <!--\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">My_Posts\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"navbar-nav pull-right\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">My_Questions\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"navbar-nav pull-right\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">My_Answers\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      -->\r\n");
      out.write("      <li class=\"navbar-nav pull-right\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\"    data-toggle=\"modal\" data-target=\"#myModal\">Add_Article\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"navbar-nav pull-right\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\"    data-toggle=\"modal\" data-target=\"#askQuestionModal\">Ask_Question\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"navbar-nav  col-sm-4\" >\r\n");
      out.write("      <img src=\"user-icon.png\" style=\"width: 50px;height: 50px;margin-left: 50px\" class=\"rounded-circle\">\r\n");
      out.write("      <li class=\"nav-link\">\r\n");
      out.write("        <button style=\"background-color: #e80d65;color: white;cursor: pointer;\" >");
      out.print(session.getAttribute("userName"));
      out.write("\r\n");
      out.write("        </button>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li  class=\"nav-link\">\r\n");
      out.write("        <form action=\"logout\" method=\"post\">\r\n");
      out.write("        <button name=\"\" style=\"background-color: #e80d65;color: white;cursor: pointer;\">logout\r\n");
      out.write("        </button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"aaabbb\" style=\"display: none;background-color: black;z-index: 100001 !important;position: absolute;min-height: 500px\" class=\"container col-sm-12\">\r\n");
      out.write("<div id=\"searchDivision\" class=\"container-fluid col-sm-7\" style=\"background-color: #ed9393\">\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--navbar-->\r\n");
      out.write("<!--header-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  //searching feature implementation\r\n");
      out.write("  function searchThreads()\r\n");
      out.write("{\r\n");
      out.write("//alert(\"load hua\");\r\n");
      out.write("vSearchString=document.getElementById(\"vSearchBox\").value.toLowerCase();\r\n");
      out.write("if(vSearchString=='')\r\n");
      out.write("{\r\n");
      out.write("document.getElementById(\"aaabbb\").style.display=\"none\";\r\n");
      out.write("return;\r\n");
      out.write("}\r\n");
      out.write("document.getElementById(\"aaabbb\").style.display=\"block\";\r\n");
      out.write("//alert(vSearchString);\r\n");
      out.write("var searchThreadJSON={\r\n");
      out.write("\"searchString\":vSearchString\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("var httpRequest=new XMLHttpRequest();\r\n");
      out.write("httpRequest.onreadystatechange=function(){\r\n");
      out.write("if(this.readyState==4 && this.status==200)\r\n");
      out.write("{\r\n");
      out.write("var data=httpRequest.responseText;\r\n");
      out.write("var applicationResponse=JSON.parse(data);\r\n");
      out.write("//var threads=[];\r\n");
      out.write("var jsonThreads=applicationResponse.result;\r\n");
      out.write("var l=jsonThreads.length;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var section=document.getElementById(\"searchDivision\");\r\n");
      out.write("while(section.hasChildNodes())\r\n");
      out.write("{\r\n");
      out.write("  section.removeChild(section.firstChild);\r\n");
      out.write("}\r\n");
      out.write("if(l=='0')\r\n");
      out.write("{\r\n");
      out.write("  var noResult=document.createElement(\"label\");\r\n");
      out.write("  noResult.innerHTML=\"No result Found !\";\r\n");
      out.write("  section.appendChild(noResult);\r\n");
      out.write("  //alert(\"ghusa\");\r\n");
      out.write("  return;\r\n");
      out.write("}\r\n");
      out.write("for(var i=0;i<l;i++)\r\n");
      out.write("{\r\n");
      out.write("  //do a work to create post and create question \r\n");
      out.write("  code=jsonThreads[i].code;\r\n");
      out.write("  subject=jsonThreads[i].subject;\r\n");
      out.write("  heading=jsonThreads[i].heading;\r\n");
      out.write("  content=jsonThreads[i].content;\r\n");
      out.write("  link=jsonThreads[i].link;\r\n");
      out.write("  imagePath=jsonThreads[i].imagePath;\r\n");
      out.write("  type=jsonThreads[i].type;\r\n");
      out.write("  userId=jsonThreads[i].userId;\r\n");
      out.write("  time=jsonThreads[i].time;\r\n");
      out.write("  //alert(code+\" \"+subject+\" \"+heading+\" \"+content+\" \"+link+\" \"+imagePath+\" \"+type+\" \"+userId+\" \"+time);\r\n");
      out.write("  if(type=='question')\r\n");
      out.write("  {\r\n");
      out.write("    createQ(content,code,userId);\r\n");
      out.write("  }\r\n");
      out.write("  else\r\n");
      out.write("  {\r\n");
      out.write("createT(imagePath,heading,content,time,code,userId);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write(";\r\n");
      out.write("httpRequest.open(\"POST\",\"searchThreads\",true);\r\n");
      out.write("httpRequest.setRequestHeader(\"content-type\",\"application/x-www-form-urlencoded\");\r\n");
      out.write("httpRequest.send(JSON.stringify(searchThreadJSON));\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("            //function to add questions in frequently asked question\r\n");
      out.write("            function createQ(vQuestion,threadId,userId)//thread ka type question hua tb ye call hoga and type article hone par createArticle wala function call hoga\r\n");
      out.write("            {\r\n");
      out.write("              var mask=document.createElement(\"div\");\r\n");
      out.write("              mask.classList.add(\"container\");\r\n");
      out.write("              mask.style=\"min-height: 50px;background-color:white; font-weight: bold;margin-right: 2px;border: 1px solid green;border-radius: 30px;\";\r\n");
      out.write("              var vquestion=document.createElement(\"a\");\r\n");
      out.write("              vquestion.style=\"word-wrap: break-word;cursor: pointer;\"\r\n");
      out.write("              vquestion.innerHTML=vQuestion;\r\n");
      out.write("              vquestion.setAttribute(\"href\",\"/skillshare/postDetails.jsp?threadId=\"+threadId+\"&userId=\"+userId);  //we send threaId to postDetails.jsp to fecth detailed record.\r\n");
      out.write("              var space=document.createElement(\"div\");\r\n");
      out.write("              space.style=\"min-height: 15px\";\r\n");
      out.write("              mask.appendChild(vquestion);\r\n");
      out.write("              \r\n");
      out.write("              var section=document.getElementById(\"searchDivision\");\r\n");
      out.write("              section.appendChild(mask);\r\n");
      out.write("              section.appendChild(space);\r\n");
      out.write("            }\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("            function createT(imgPath,vHeading,vContentPart,vTime,threadId,userId)\r\n");
      out.write("            {\r\n");
      out.write("            var mask=document.createElement(\"div\");\r\n");
      out.write("              mask.classList.add(\"row\");\r\n");
      out.write("              mask.style=\"border: 1px solid green;border-radius: 25px;background-color: white;opacity: .9\";\r\n");
      out.write("            var imageSection=document.createElement(\"div\");\r\n");
      out.write("              imageSection.classList.add(\"col-sm-4\");\r\n");
      out.write("              imageSection.style=\"left:0\";\r\n");
      out.write("            var img=document.createElement(\"img\");\r\n");
      out.write("                img.setAttribute(\"src\",imgPath);\r\n");
      out.write("                img.classList.add(\"rounded\");\r\n");
      out.write("                img.classList.add(\"img-fluid\");\r\n");
      out.write("                img.style=\";height: 10rem\";\r\n");
      out.write("            var center=document.createElement(\"CENTER\");\r\n");
      out.write("                center.appendChild(img);\r\n");
      out.write("                imageSection.appendChild(center);\r\n");
      out.write("            var contentSection=document.createElement(\"div\");\r\n");
      out.write("              contentSection.classList.add(\"col-sm-8\");\r\n");
      out.write("              contentSection.style=\"min-height: 50px;padding:3px\";\r\n");
      out.write("            var heading=document.createElement(\"p\");\r\n");
      out.write("                heading.style=\"width: 100%;word-wrap: break-word;font-weight: bold;font-size: 21px\";\r\n");
      out.write("                heading.innerHTML=vHeading;\r\n");
      out.write("            var content=document.createElement(\"p\");\r\n");
      out.write("                content.style=\"width: 100%;word-wrap: break-word;margin-top: 3px;font-style: italic;font-size: 18px\";\r\n");
      out.write("                content.innerHTML=vContentPart.substring(0, 40);\r\n");
      out.write("            var link=document.createElement(\"a\");\r\n");
      out.write("                link.style=\"cursor: pointer;\"\r\n");
      out.write("                link.innerHTML=\"read more.......\";\r\n");
      out.write("                link.setAttribute(\"href\",\"/skillshare/postDetails.jsp?threadId=\"+threadId+\"&userId=\"+userId); \r\n");
      out.write("            var time=document.createElement(\"label\");\r\n");
      out.write("                time.innerHTML=vTime;\r\n");
      out.write("                time.style=\"margin-left:50%\";\r\n");
      out.write("            contentSection.appendChild(heading);\r\n");
      out.write("            contentSection.appendChild(content);\r\n");
      out.write("            contentSection.appendChild(link);\r\n");
      out.write("            contentSection.appendChild(time);\r\n");
      out.write("            mask.appendChild(imageSection);\r\n");
      out.write("            mask.appendChild(contentSection);\r\n");
      out.write("\r\n");
      out.write("            var space=document.createElement(\"div\");\r\n");
      out.write("              space.style=\"min-height: 5px\";\r\n");
      out.write("              //mask.appendChild(question);\r\n");
      out.write("              \r\n");
      out.write("              var section=document.getElementById(\"searchDivision\");\r\n");
      out.write("              section.appendChild(mask);\r\n");
      out.write("              section.appendChild(space);\r\n");
      out.write("            }\r\n");
      out.write("</script>\r\n");
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
