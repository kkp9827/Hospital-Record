<%-- 
    Document   : viewcustomer
    Created on : 3 Mar, 2022, 5:39:04 PM
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
        
        <table border="1" class="table table-striped">
            <thead>
            <tr><th>Sr.nO</th><th>Customer name</th><th> Email Address</th><th>Contact No</th><th>Doctor</th><th>Problem Statement</th><th>Password</th>
                <th>Edit</th><th>Delete</th>
             
            </tr>
            </thead>
            <tbody>
                <%
         try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from sign";
		    ResultSet rs=st.executeQuery(sql);
		while(rs.next())
                {
                    %>
            <tr>
                <td><%=rs.getString("Sno") %></td>
                <td><%=rs.getString("myname") %></td>
                <td><%=rs.getString("address") %></td>
                <td><%=rs.getString("contact") %></td>
                <td><%=rs.getString("doctor") %></td>
                <td><%=rs.getString("problem") %></td>
                <td><%=rs.getString("password") %></td>
                <td><a href="http://localhost:8080/Saviour/admin/editcustomer.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-success"> <span class="glyphicon glyphicon-edit"></span>Edit</a></td>
                <td><a href="http://localhost:8080/Saviour/admin/deletecustomer.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-danger">  <span class="glyphicon glyphicon-remove"></span>Delete</a></td>
            
            </tr>
                    
                  <%
                }
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
            </tbody>
        </table>
    </body>
</html>