<%-- 
    Document   : getpassword
    Created on : 4 Mar, 2022, 5:09:32 PM
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
            
       String cnumber=request.getParameter("num");
       
            
             try
           {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from sign where contact='"+cnumber+"'";
		    ResultSet rs=st.executeQuery(sql);
		    rs.next();
                    if(rs.getRow()>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/forgetpassword.jsp?msg=Your Password is :"+rs.getString("password"));
                    else
                       response.sendRedirect("http://localhost:8080/Saviour/admin/forgetpassword.jsp?msg=Wrong Credential");
               
           }
           catch(Exception e){out.println(e.getMessage());}
             
             %>
    </body>
</html>
