<%-- 
    Document   : editcustomer
    Created on : 3 Mar, 2022, 5:15:09 PM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
 
    <title> Hospitals  </title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
       
    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">
    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Edit Hospital</h1>
                            </div>
                    
                                   <%  
          
            try
             {
            	
          Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from sign where Sno='"+request.getParameter("id")+"'";
		   ResultSet rs=st.executeQuery(sql);
                   rs.next();
		   if(rs.getRow()>0)
                   {
                       %>     
                            
                       <form class="user" method="get" action="updatecustomer.jsp">
                               <div class="form-group">
                                  <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>" id="exampleInputEmail" name="id"
                                        placeholder="Enter your name">
                                   <input type="text" class="form-control form-control-user" value="<%=rs.getString("myname")  %>" id="exampleInputEmail" name="hospname"
                                        placeholder="Enter your name">
                                </div>
                          
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno") %>" id="exampleInputEmail" name="id"
                                        placeholder="Address">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("address") %>" id="exampleInputEmail" name="address"
                                        placeholder="Email Address">
                                </div>
                                
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno") %>"id="exampleInputEmail" name="id"
                                        placeholder="contact">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("contact") %>"id="exampleInputEmail" name="cno"
                                        placeholder="contact">
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno") %>" id="exampleInputEmail" name="id"
                                        placeholder="Doctor you want to meet">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("doctor") %>" id="exampleInputEmail" name="doc"
                                        placeholder="Doctor you want to meet">
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno") %>"id="exampleInputEmail" name="id"
                                        placeholder="Problem Statement">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("problem") %>"id="exampleInputEmail" name="prob"
                                        placeholder="Problem Statement">
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno") %>"id="exampleInputEmail" name="id"
                                        placeholder="Password">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("password") %>"id="exampleInputEmail" name="pass"
                                        placeholder="Password">
                                </div>
                                <button type="submit" class="btn btn-primary btn-user btn-block">
                                    update Customer
                                </button>
                                <div style="color:green">
                                <% if(request.getParameter("msg")!=null){%>
                                <%=request.getParameter("msg")%>
                                <%}%>
                                </div>
                                <hr>
                            </form>
                            <hr>
                         <%
                   }
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
                         
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

</body>
</html>
