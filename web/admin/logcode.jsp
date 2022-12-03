<%-- 
    Document   : logcode
    Created on : 14 Sep, 2021, 4:25:26 PM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
       String email=request.getParameter("email");
            String pa=request.getParameter("password");
            
             try
           {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from sign where address='"+email+"' and password='"+pa+"'";
		    ResultSet rs=st.executeQuery(sql);
		    rs.next();
                    if(rs.getRow()>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/adminpanel.jsp");
                    else
                       response.sendRedirect("http://localhost:8080/Saviour/admin/login.jsp?msg=Sorry id or password is wrong");
               
           }
           catch(Exception e){out.println(e.getMessage());}
             
             %>
    </body>
</html>
