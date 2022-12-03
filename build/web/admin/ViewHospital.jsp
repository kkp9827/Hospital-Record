<%-- 
    Document   : ViewHospital
    Created on : 15 Sep, 2021, 4:12:23 PM
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
            <tr><th>Sr.nO</th><th>Hospital name</th><th>License NO</th><th>address</th><th>city</th><th>state</th><th>contact</th><th>cylinder per day</th><th>time of filing</th>
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
		String sql="Select * from details";
		    ResultSet rs=st.executeQuery(sql);
		while(rs.next())
                {
                    %>
            <tr>
                <td><%=rs.getString("Sno") %></td>
                <td><%=rs.getString("hospitalname") %></td>
                <td><%=rs.getString("LicenseNo") %></td>
                <td><%=rs.getString("address") %></td>
                <td><%=rs.getString("city") %></td>
                <td><%=rs.getString("state") %></td>
                <td><%=rs.getString("contact") %></td>
                <td><%=rs.getString("cylinderperday") %></td>
                <td><%=rs.getString("timeoffiling") %></td>
                <td><a href="http://localhost:8080/Saviour/admin/edithospital.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-success"> <span class="glyphicon glyphicon-edit"></span>Edit</a></td>
                <td><a href="http://localhost:8080/Saviour/admin/deleteHospital.jsp?id=<%=rs.getString("Sno") %>" class="btn btn-danger">  <span class="glyphicon glyphicon-remove"></span>Delete</a></td>
            
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
