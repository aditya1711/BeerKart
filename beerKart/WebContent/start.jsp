<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String username = (String)(request.getAttribute("username"));
		String color =(String)(request.getAttribute("color"));
		String budget = (String)(request.getAttribute("budget"));
	%>
	Hi, <br>
	<%= username %>
	<%if(color!=null && budget != null){ %>
	 <br> Looking for a beer in <%= color %> with <%= budget %> price range? <br>
	 <a href = "checkout.jsp"> YES </a>
	 <br>
	 <a href = "color.jsp"> Else proceed to selection </a>
	
	<% }else { %> 
		<a href = "color.jsp"> Proceed to selection </a>
	<%} %>
	
	
	<br>
</body>
</html>