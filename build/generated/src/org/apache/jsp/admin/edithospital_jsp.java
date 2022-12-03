package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edithospital_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write(" \n");
      out.write("    <title> Hospitals  </title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-gradient-primary\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"card o-hidden border-0 shadow-lg my-5\">\n");
      out.write("            <div class=\"card-body p-0\">\n");
      out.write("                <!-- Nested Row within Card Body -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-7\">\n");
      out.write("                        <div class=\"p-5\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <h1 class=\"h4 text-gray-900 mb-4\">Edit Hospital</h1>\n");
      out.write("                            </div>\n");
      out.write("                    \n");
      out.write("                                   ");
  
          
                   try
                   {
            	
             Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		      Statement st=con.createStatement();
		        String sql="Select * from details where Sno='"+request.getParameter("id")+"'";
		   ResultSet rs=st.executeQuery(sql);
                   rs.next();
		   if(rs.getRow()>0)
                   {
                       
      out.write("     \n");
      out.write("                            \n");
      out.write("                       <form class=\"user\" method=\"get\" action=\"updatehospital.jsp\">\n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno")  );
      out.write("\" id=\"exampleInputEmail\" name=\"id\"\n");
      out.write("                                        placeholder=\"Hospital Name\">\n");
      out.write("                                   <input type=\"text\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("hospitalname")  );
      out.write("\" id=\"exampleInputEmail\" name=\"hospname\"\n");
      out.write("                                        placeholder=\"Hospital Name\">\n");
      out.write("                                  </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\" id=\"exampleInputEmail\"name=\"id\"\n");
      out.write("                                        placeholder=\"License Number\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("LicenseNo") );
      out.write("\" id=\"exampleInputEmail\"name=\"number\"\n");
      out.write("                                        placeholder=\"License Number\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\" id=\"exampleInputEmail\" name=\"id\"\n");
      out.write("                                        placeholder=\"Address\">\n");
      out.write("                                    <input type=\"Address\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("address") );
      out.write("\" id=\"exampleInputEmail\" name=\"address\"\n");
      out.write("                                        placeholder=\"Address\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\n");
      out.write("                                        <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\"id=\"exampleFirstName\"name=\"id\"\n");
      out.write("                                            placeholder=\"City\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("city") );
      out.write("\"id=\"exampleFirstName\"name=\"cty\"\n");
      out.write("                                            placeholder=\"City\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\"id=\"exampleLastName\" name=\"id\"\n");
      out.write("                                            placeholder=\"State\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("state") );
      out.write("\"id=\"exampleLastName\" name=\"state\"\n");
      out.write("                                            placeholder=\"State\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\"id=\"exampleInputEmail\" name=\"id\"\n");
      out.write("                                        placeholder=\"Contact Number\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("contact") );
      out.write("\"id=\"exampleInputEmail\" name=\"cno\"\n");
      out.write("                                        placeholder=\"Contact Number\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\" id=\"exampleInputEmail\" name=\"id\"\n");
      out.write("                                        placeholder=\"Required Cylinder per day\">\n");
      out.write("                                    <input type=\"number\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("cylinderperday") );
      out.write("\" id=\"exampleInputEmail\" name=\"cylinder\"\n");
      out.write("                                        placeholder=\"Required Cylinder per day\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"hidden\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("Sno") );
      out.write("\"id=\"exampleInputEmail\" name=\"id\"\n");
      out.write("                                        placeholder=\"Time of Filling\">\n");
      out.write("                                    <input type=\"time\" class=\"form-control form-control-user\" value=\"");
      out.print(rs.getString("timeoffiling") );
      out.write("\"id=\"exampleInputEmail\" name=\"time\"\n");
      out.write("                                        placeholder=\"Time of Filling\">\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-user btn-block\">\n");
      out.write("                                    update Hospital\n");
      out.write("                                </button>\n");
      out.write("                                <div style=\"color:green\">\n");
      out.write("                                ");
 if(request.getParameter("msg")!=null){
      out.write("\n");
      out.write("                                ");
      out.print(request.getParameter("msg"));
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                            </form>\n");
      out.write("                            <hr>\n");
      out.write("                         ");

                   }
           }
           catch(Exception e){out.println(e.getMessage());} 
        
      out.write("\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
