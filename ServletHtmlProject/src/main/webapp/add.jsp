<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding JSP File</title>
</head>
<body bgcolor="cyan">

		<!-- This is (directive)how we import packages in JSP  -->
		<%-- <%@page // import="java.util.Date", "morepackages" %>  --%>
		
		
		<!-- This is (decleration) how we write some code out side service method -->
		<%-- <%! 
		 //int variable = 1;
		// methods
		%>  --%>
		

		<!-- This is (Scriplet) how we write some code in side service method --> 
		<%
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			
			int total = i+j;
			
			//out.println("Total is :"+ total);
		%>
		
		
		<!-- This is (expression) a another way to write print statement -->
		<%-- <%= //we can print someting here %>  --%>
		
		
		

</body>
</html>