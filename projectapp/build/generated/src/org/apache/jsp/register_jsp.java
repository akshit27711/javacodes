package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("<link rel=\"shortcut icon\" href=\"1.ico\">\n");
      out.write("<style>\n");
      out.write(".parent {\n");
      out.write(" position: absolute;\n");
      out.write("\n");
      out.write("    width: 300px;\n");
      out.write("    height: 300px;\n");
      out.write("\n");
      out.write("    /* Center form on page horizontally & vertically */\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    margin-top: -150px;\n");
      out.write("    margin-left: -150px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\t height:100%;\n");
      out.write("  width:100%;\n");
      out.write("  margin:0;\n");
      out.write("}\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=password], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=email], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("input[type=address], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".forml{\n");
      out.write("\n");
      out.write(" left: 50%;\n");
      out.write("    top: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    -webkit-transform: translate3d(-50%, -50%, 0);\n");
      out.write("    -moz-transform: translate3d(-50%, -50%, 0);\n");
      out.write("    transform: translate3d(-50%, -50%, 0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("function func()\n");
      out.write("{\n");
      out.write("var count=0;\n");
      out.write("var a=document.getElementById(\"no\").value;\n");
      out.write("if (document.getElementById(\"check\").checked == true && document.getElementById(\"n\").value != \"\" && document.getElementById(\"e\").value != \"\" && document.getElementById(\"p\").value != \"\" && document.getElementById(\"no\").value != \"\" && document.getElementById(\"add\").value != \"\" && document.getElementById(\"da\").value != \"\")\n");
      out.write("{\n");
      out.write("while (a!=0)\n");
      out.write("{\n");
      out.write(" a=parseInt(a/10);\n");
      out.write(" count=count+1;\n");
      out.write("}\n");
      out.write("if (count==10){\n");
      out.write("window.open(\"project.html\",\"_blank\");}\n");
      out.write("else{alert(\"check your no\");}\n");
      out.write("}\n");
      out.write("else{\n");
      out.write("alert(\"check for your inputs/agree to our terms and conditions\");\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"parent\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<form class=\"forml\" action=\"regjsp.jsp\">\n");
      out.write("\n");
      out.write("<table cellpadding=\"5\" cellspacing=\"5\">\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Name:<input type=\"text\" id=\"n\" name=\"txtFName\" size=\"39\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td style=\"font-size:20;\"><input type=\"radio\" name=\"rdoGender\" id=\"Male\" value=\"Male\"><label for=\"Male\">Male</label><input type=\"radio\" name=\"rdoGender\" id=\"Female\" value=\"Female\"><label for=\"Female\">Female</label></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Email:<input type=\"email\" id=\"e\" name=\"txtEmail\" size=\"39\"> </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Password:<input type=\"password\" id=\"p\" name=\"txtpassword\" size=\"39\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Address:<br><textarea id=\"add\" type=\"text\" rows=\"5\" cols=\"41\" name=\"txtarAddress\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Date of Birth:<input type=\"date\" id=\"da\" name=\"Age\" size=\"50\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\"><input type=\"checkbox\" name=\"tac\" id=\"check\" checked>Agree to our terms and conditions?</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td style=\"font-size:20;\">Mobile Number:<input type=\"text\" id=\"no\" name=\"num\" maxlength=10 size=\"39\"></td>\n");
      out.write("\t<select name=\"cboStates\">\n");
      out.write("\t<option value=\"chandigarh\">chandigarh</option>\n");
      out.write("\t<option value=\"panchkula\">panchkula</option>\n");
      out.write("\t<option value=\"mohali\">mohali</option>\n");
      out.write("\t</select></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\"><input type=\"submit\" value=\"Sign up\" style=\"height:2.5em;width:7em;\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<p style=\"font-size:20;\" align=\"center\"><a href=\"indexpage.html\">Already have an account</a></p>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("       ");

           
            String txtFName=request.getParameter("txtFName");
            String txtEmail=request.getParameter("txtEmail");
            String txtpassword=request.getParameter("txtpassword");
            String num=request.getParameter("num");
              out.println(txtFName);
           out.println(txtEmail);
             session.setAttribute("txtFName", txtFName);
            session.setAttribute("txtEmail",txtEmail);
             session.setAttribute("txtpassword", txtpassword);
            session.setAttribute("num", num);
            
      out.write("\n");
      out.write("           \n");
      out.write("</body>\n");
      out.write("</html>");
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
