<%-- 
    Document   : supplycode
    Created on : 22 Feb, 2022, 5:04:18 PM
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
            String Hname=request.getParameter("suppname");
            String address =request.getParameter("address");
            String city =request.getParameter("cty");
            String state =request.getParameter("state");
            String contact =request.getParameter("cno");
            String cylinder =request.getParameter("cylinder");
            
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="insert into supply(name,supplieraddress,city,state,contact,stockcapacity)values('"+Hname+"','"+address+"','"+city+"','"+state+"','"+contact+"','"+cylinder+"')";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Myfirstproject/admin/Addsupplier.jsp?msg=You are successfully registered.");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
