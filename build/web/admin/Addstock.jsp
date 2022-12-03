<%-- 
    Document   : Addstock
    Created on : 24 Feb, 2022, 5:08:17 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <div class="col-lg-5 d-none d-lg-block bg-register-image"> </div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Add Stock</h1>
                            </div>
                            <form class="user" method="get" action="stockcode.jsp">
                               <div class="form-group">
                                    <input type="text" class="form-control form-control-user" id="exampleInputEmail" name="suppname"
                                        placeholder="Enter your Id">
                                </div>
                              
                                <div class="form-group" id="exampleInputEmail">
                                    
                                           
                                    <select class="form-select,form-control form-control-user" name="cno" style="width: 100%;height:66px;" >
                                            <option>Cylinder weight </option>
                                        <option value="0" >5 kg</option>
                                        <option value="1">10 kg</option>
                                        <option value="2">15 kg</option>
                                        <option value="3">20 kg</option>
                                        <option value="4">25 kg</option>
                                        <option value="5">30 kg</option>
                             
                                    </select>
                                   
                                        
                                </div>
                                <div class="form-group">
                                    <input type="number" class="form-control form-control-user" id="exampleInputEmail" name="cylinder"
                                        placeholder="No of cylinder">
                                </div>
                                
                                <button type="submit" class="btn btn-primary btn-user btn-block">
                                    upload
                                </button>
                                <div style="color:green">
                                <% if(request.getParameter("msg")!=null){%>
                                <%=request.getParameter("msg")%>
                                <%}%>
                                </div>
                                <hr>
                              
                            </form>
                            <hr>
                           
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
