<%-- 
    Document   : signupcode
    Created on : 28 Feb, 2022, 4:10:44 PM
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
		String sql="Delete from details where Sno='"+id+"'";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/adminpanel.jsp?menu=4");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
