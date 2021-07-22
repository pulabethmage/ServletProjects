<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">

<!--  Here we have to mention isErrorPage="true" in the directive tag  -->
		
		<h1 style="color: white; text-align: center;">
		<% out.println(exception.getMessage()); %> 
		</h1>

</body>
</html>