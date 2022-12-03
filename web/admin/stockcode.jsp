<%-- 
    Document   : stockcode
    Created on : 24 Feb, 2022, 5:27:15 PM
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
            String suppId=request.getParameter("suppname");
            String weight =request.getParameter("cno");
            String cylinder =request.getParameter("cylinder");
            
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="insert into upload(supplierId,cylinderweight,Noofcylinder)values('"+suppId+"','"+weight+"','"+cylinder+"')";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Myfirstproject/admin/Addstock.jsp?msg=You have successfully uploaded.");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
