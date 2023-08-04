<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@ page import="org.springframework.context.ApplicationContext, 
					org.springframework.web.context.support.WebApplicationContextUtils,com.kkh.springframe.HelloSpring"%>
	<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>안녕하세요</title>
	</head>
	
	<body>
	<%
	ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(
			request.getSession().getServletContext());
	HelloSpring helloSpring = context.getBean(HelloSpring.class);
	
	out.println(helloSpring.sayHello("Root Context"));
	%>
	</body>
</html>