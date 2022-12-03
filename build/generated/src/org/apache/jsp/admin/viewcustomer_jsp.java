package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("            <tr><th>Sr.nO</th><th>Customer name</th><th>address</th><th>Contact No</th><th>Doctor</th><th>Problem Statement</th><th>Password</th>\n");
      out.write("                <th>Edit</th><th>Delete</th>\n");
      out.write("             \n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

         try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from sign";
		    ResultSet rs=st.executeQuery(sql);
		while(rs.next())
                {
                    
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("Sno") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("myname") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("contact") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("doctor") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("problem") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("password") );
      out.write("</td>\n");
      out.write("                <td><a href=\"http://localhost:8080/Saviour/admin/editcustomer.jsp?id=");
      out.print(rs.getString("Sno") );
      out.write("\" class=\"btn btn-success\"> <span class=\"glyphicon glyphicon-edit\"></span>Edit</a></td>\n");
      out.write("                <td><a href=\"http://localhost:8080/Saviour/admin/deletecustomer.jsp?id=");
      out.print(rs.getString("Sno") );
      out.write("\" class=\"btn btn-danger\">  <span class=\"glyphicon glyphicon-remove\"></span>Delete</a></td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("                    \n");
      out.write("                  ");

                }
           }
           catch(Exception e){out.println(e.getMessage());} 
        
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
