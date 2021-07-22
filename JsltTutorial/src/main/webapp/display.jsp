<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- In here we are importing the jstl tags -->
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tutorial</title>
</head>
<body>

		<%
		String myname = request.getAttribute("myname").toString();
		out.println(myname); 
		%>

		<br>
		<!-- Another way of calling attibutes -->
		${myname}<br>
		
		<c:out value="Hello world!" />

</body>
</html>