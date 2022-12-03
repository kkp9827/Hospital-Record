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
            String Hname=request.getParameter("myname");
            String address =request.getParameter("mail");
            String contact =request.getParameter("cno");
            String doctor =request.getParameter("doctor");
            String statement =request.getParameter("problm");
            String password =request.getParameter("pass");
            
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="insert into sign(myname,address,contact,doctor,problem,password)values('"+Hname+"','"+address+"','"+contact+"','"+doctor+"','"+statement+"','"+password+"')";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/Addcustomer.jsp?msg=You are successfully registered.");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
