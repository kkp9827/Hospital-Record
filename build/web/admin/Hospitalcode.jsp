<%-- 
    Document   : Hospitalcode
    Created on : 12 Jan, 2022, 10:06:50 PM
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
            String Hname=request.getParameter("hospname");
            String License=request.getParameter("number");
            String address =request.getParameter("address");
            String city =request.getParameter("cty");
            String state =request.getParameter("state");
            String contact =request.getParameter("cno");
            String cylinder =request.getParameter("cylinder");
            String time =request.getParameter("time");
            
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="insert into details(hospitalname,LicenseNO,address,city,state,contact,cylinderperday,timeoffiling)values('"+Hname+"','"+License+"','"+address+"','"+city+"','"+state+"','"+contact+"','"+cylinder+"','"+time+"')";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Myfirstproject/admin/AddHospital.jsp?msg=You are successfully registered.");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
