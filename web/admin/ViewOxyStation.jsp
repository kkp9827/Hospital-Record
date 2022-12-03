<%-- 
    Document   : ViewOxyStation
    Created on : 15 Sep, 2021, 4:13:39 PM
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
            <tr>
                <th>Sr.nO</th><th>Name</th><th>supplieraddress</th><th>city</th><th>state</th><th>contact</th><th>stockcapacity</th><th>Edit</th><th>Delete</th>
            </tr>
        <%
        try
           {
            	
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_oxygen?useSSL=False","root","root");
		Statement st=con.createStatement();
		String sql="Select * from supply";
		    ResultSet rs=st.executeQuery(sql);
		while(rs.next())
                {
                    %>
            <tr>
             <td><%=rs.getString("Sno") %></td>
             <td><%=rs.getString("name") %></td>
             <td><%=rs.getString("supplieraddress") %></td>
             <td><%=rs.getString("city") %></td>
             <td><%=rs.getString("state") %></td>
             <td><%=rs.getString("contact") %></td>
             <td><%=rs.getString("stockcapacity") %></td>
            <td><a href="http://localhost:8080/Saviour/admin/editsupplier.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-success"> <span class="glyphicon glyphicon-edit"></span>Edit</a></td>
            <td><a href="http://localhost:8080/Saviour/admin/deletesupplier.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-danger">  <span class="glyphicon glyphicon-remove"></span>Delete</a></td>
            
            
            </tr>
                    
                    <%
                }
           }
           catch(Exception e){out.println(e.getMessage());} 
        %>
        
        </table>
    </body>
</html>
