package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SB Admin 2 - Tables</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template -->\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this page -->\n");
      out.write("    <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">SB Admin <sup>2</sup></div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("   \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=1\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Add Hospital</span></a>\n");
      out.write("            </li> \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=2\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Add supplier</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=3\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Add customer</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=4\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>View Hospital</span></a>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=5\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>View Oxygen</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"adminpanel.jsp?menu=6\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>View customer</span></a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <form class=\"form-inline\">\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Search -->\n");
      out.write("                    <form\n");
      out.write("                        class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\n");
      out.write("                                aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"searchDropdown\">\n");
      out.write("                                <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                                            placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                                            aria-describedby=\"basic-addon2\">\n");
      out.write("                                        <div class=\"input-group-append\">\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Alerts -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Alerts -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">3+</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Alerts -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"alertsDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Alerts Center\n");
      out.write("                                </h6>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-primary\">\n");
      out.write("                                            <i class=\"fas fa-file-alt text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 12, 2019</div>\n");
      out.write("                                        <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-success\">\n");
      out.write("                                            <i class=\"fas fa-donate text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 7, 2019</div>\n");
      out.write("                                        $290.29 has been deposited into your account!\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-warning\">\n");
      out.write("                                            <i class=\"fas fa-exclamation-triangle text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 2, 2019</div>\n");
      out.write("                                        Spending Alert: We've noticed unusually high spending for your account.\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Messages -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Messages -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"messagesDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Message Center\n");
      out.write("                                </h6>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_1.svg\"\n");
      out.write("                                            alt=\"...\">\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"font-weight-bold\">\n");
      out.write("                                        <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a\n");
      out.write("                                            problem I've been having.</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_2.svg\"\n");
      out.write("                                            alt=\"...\">\n");
      out.write("                                        <div class=\"status-indicator\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">I have the photos that you ordered last month, how\n");
      out.write("                                            would you like them sent to you?</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Jae Chun · 1d</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"img/undraw_profile_3.svg\"\n");
      out.write("                                            alt=\"...\">\n");
      out.write("                                        <div class=\"status-indicator bg-warning\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">Last month's report looks great, I am very happy with\n");
      out.write("                                            the progress so far, keep up the good work!</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Morgan Alvarez · 2d</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\"\n");
      out.write("                                            alt=\"...\">\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone\n");
      out.write("                                            told me that people say this to all dogs, even if they aren't good...</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Chicken the Dog · 2w</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - User Information -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas McGee</span>\n");
      out.write("                                <img class=\"img-profile rounded-circle\"\n");
      out.write("                                    src=\"img/undraw_profile.svg\">\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - User Information -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"userDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Profile\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Settings\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Activity Log\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Logout\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("                <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                <!-- Begin Page Content -->\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    ");

                    int menu=1;
                    if(request.getParameter("menu")!=null)
                    menu=Integer.parseInt(request.getParameter("menu"));
                    
                   
                       switch(menu)
                       {
                           case 1:
                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AddHospital.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        break;
                        case 2:
                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Addsupplier.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        break;
                        case 3:
                    
      out.write(" \n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Addcustomer.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        break;
                        case 4:
                    
      out.write(" \n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ViewHospital.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        break;
                        case 5:
                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ViewOxyStation.jsp", out, false);
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        break;
                        case 6:
                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "viewcustomer.jsp", out, false);
      out.write("\n");
      out.write("                  \n");
      out.write("                    ");

                        break;
                        }
                    
      out.write("\n");
      out.write("                     \n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\n");
      out.write("                <div class=\"container my-auto\">\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\n");
      out.write("                        <span>Copyright &copy; Your Website 2020</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- End of Footer -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("        aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("    <!-- Page level plugins -->\n");
      out.write("    <script src=\"vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level custom scripts -->\n");
      out.write("    <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
