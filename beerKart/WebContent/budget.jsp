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
<h1>Budget Selection page</h1>
</div>
<%! String budget; %>

	<%
		Cookie[] cookies =request.getCookies();
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals("budget")){
				budget = cookies[i].getValue();
			}
		}
	
	%>
	<%if(budget!=null){
		out.println("Maybe " + budget);
		}		
	%>
<div><form action="budget" method="POST">Select beer characteristics
<p>Budget:<select name="budget" size="1">
<option value="low">low</option>
<option value="high">high</option>
</select><br /><br /></p>
<center><input type="SUBMIT" /></center><center></center><center></center>
</body>
</html>