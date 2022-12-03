<%-- 
    Document   : editsupplier
    Created on : 3 Mar, 2022, 4:11:13 PM
    Author     : HP
--%>

<%@page contentType="text/html" import=" java.sql.*"  pageEncoding="UTF-8"%>
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
                                <h1 class="h4 text-gray-900 mb-4">Edit Supplier</h1>
                            </div>
                   <%  
          
             try
              {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from supply where Sno='"+request.getParameter("id")+"'";
		   ResultSet rs=st.executeQuery(sql);
                   rs.next();
		   if(rs.getRow()>0)
                   {
                       %>
                           
                       <form class="user" method="get" action="updatesupplier.jsp">
                               <div class="form-group">
                                   <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleInputEmail" name="id"
                                        placeholder="supplier Name">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("name")  %>"id="exampleInputEmail" name="suppname"
                                        placeholder="supplier Name">
                                </div>
                              
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleInputEmail" name="id"
                                        placeholder="Address">
                                    <input type="Address" class="form-control form-control-user" value="<%=rs.getString("supplieraddress")  %>"id="exampleInputEmail" name="address"
                                        placeholder="Address">
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                         <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleFirstName"name="id"
                                            placeholder="City">
                                        <input type="text" class="form-control form-control-user" value="<%=rs.getString("city")  %>"id="exampleFirstName"name="cty"
                                            placeholder="City">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleLastName" name="id"
                                            placeholder="State">
                                        <input type="text" class="form-control form-control-user" value="<%=rs.getString("state")  %>"id="exampleLastName" name="state"
                                            placeholder="State">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleInputEmail" name="id"
                                        placeholder="Contact Number">
                                    <input type="text" class="form-control form-control-user" value="<%=rs.getString("contact")  %>"id="exampleInputEmail" name="cno"
                                        placeholder="Contact Number">
                                </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control form-control-user" value="<%=rs.getString("Sno")  %>"id="exampleInputEmail" name="id"
                                        placeholder="stock capacity">
                                    <input type="number" class="form-control form-control-user" value="<%=rs.getString("stockcapacity")  %>"id="exampleInputEmail" name="cylinder"
                                        placeholder="stock capacity">
                                </div>
                                
                                <button type="submit" class="btn btn-primary btn-user btn-block">
                                    update supplier
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