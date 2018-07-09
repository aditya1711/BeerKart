<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h1>Color Selection page</h1>
</div>
<%! String color; %>
	<%
		Cookie[] cookies =request.getCookies();
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals("color")){
				color = cookies[i].getValue();
			}
		}
	
	%>
	<%if(color!=null){
		out.println("Maybe " + color);
		}		
	%>

<div><form action="color" method="POST">Select beer characteristics
<p>Color:<select name="color" size="1">
<option value="dark">dark</option>
<option value="light">light</option>
</select><br /><br /></p>
<center><input type="SUBMIT" /></center><center></center><center></center>
</body>
</html>