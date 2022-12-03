<%-- 
    Document   : updatesupplier
    Created on : 4 Mar, 2022, 12:53:21 PM
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
            String Hname=request.getParameter("suppname");
            String address =request.getParameter("address");
            String City =request.getParameter("cty");
            String State =request.getParameter("state");
            String contac =request.getParameter("cno");
            String Cylinder =request.getParameter("cylinder");
           try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="update supply set name='"+Hname+"',supplieraddress='"+address+"',city='"+City+"',state='"+State+"',contact='"+contac+"',stockcapacity='"+Cylinder+"'  where Sno='"+id+"'";
		    int i=st.executeUpdate(sql);
		    if(i>0)
		    	response.sendRedirect("http://localhost:8080/Saviour/admin/adminpanel.jsp?menu=5");
               
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
    </body>
</html>
