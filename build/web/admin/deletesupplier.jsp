<%-- 
    Document   : deletesupplier
    Created on : 1 Mar, 2022, 10:17:48 PM
    Author     : HP
--%>

<%@page contentType="text/html" import="java.sql.*"pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
          String id=request.getParameter("id");
            
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Delete from supply where Sno='"+id+"'";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Myfirstproject/admin/adminpanel.jsp?menu=5");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>

