<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
Id : <input type="number" name="sid" value=<%=request.getParameter("sid") %>><br>
Name : <input type="text" name="name" value=<%=request.getParameter("name") %>><br>
phno : <input type="number" name="phno" value=<%=request.getParameter("phno") %>><br>
Gender : <input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<br>
<button>Update</button>
</form>
</body>
</html>