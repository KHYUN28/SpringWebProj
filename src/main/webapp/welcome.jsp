<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome</h1>
    <p>Hello, ${username}!</p>
    <%--<p>Hello, <%= request.getParameter("username") %>!</p>--%>
    <p>Welcome to our website.</p>
    <a href="/SpringWebProj/index.html">반갑습니다</a>
    <a href="/SpringWebProj/login.jsp">로그인</a>
    <a href="/SpringWebProj/static/index.html" >계산기</a>
</body>
</html>