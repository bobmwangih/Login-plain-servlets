<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if (session.getAttribute("username") == null) {
		response.sendRedirect("index.jsp");
	}
	%>
	<iframe width="1799" height="717"
		src="https://www.youtube.com/embed/gQLQ0t9B5yk?list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46"
		frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
</body>
</html>