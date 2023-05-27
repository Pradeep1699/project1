<%@page import="studentDto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<StudentDto>	q=(List<StudentDto>)request.getAttribute("fetchAll"); %>
<table border="">
<tr>
<th>SID</th>
<th>Name</th>
<th>Gender</th>
<th>Phone</th>
<th>delete</th>
<th>Update</th>
</tr>
<%for(StudentDto d:q) {%>
<tr>
<td><%=d.getID() %></td>
<td><%=d.getName() %></td>
<td><%=d.getGender() %></td>
<td><%=d.getPh_no() %></td>
<td><a href="delete?sid=<%=d.getID() %>">delete</a></td>
<td><a href="update.jsp?sid=<%=d.getID() %>&name=<%=d.getName() %> &gender<%=d.getGender() %>&phno<%=d.getPh_no()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>