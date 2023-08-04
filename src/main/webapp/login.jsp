<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h2>Login Page</h2>
	<%--<form action="/SpringWebProj/static/index.html" method="post">--%>
    <form action="/SpringWebProj/welcome.jsp" method="post">
        <label for="username">username :</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">password :</label>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="Login">
    </form>
</body>
</html>