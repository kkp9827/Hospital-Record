<%-- 
    Document   : updatecustomer
    Created on : 4 Mar, 2022, 12:54:53 PM
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
            String Hname=request.getParameter("hospname"); 
            String Address =request.getParameter("address");
            String contac =request.getParameter("cno");
            String Doctor =request.getParameter("doc");
            String Cylinder =request.getParameter("prob");
            String pasword =request.getParameter("pass");
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="update sign set myname='"+Hname+"',address='"+Address+"',contact='"+contac+"',doctor='"+Doctor+"',problem='"+Cylinder+"',password='"+pasword+"'  where Sno='"+id+"'";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/adminpanel.jsp?menu=6");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
