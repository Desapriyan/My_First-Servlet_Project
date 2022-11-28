<%@ page import="java.util.List"%>
<%@ page import="com.userform.dto.User"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Informations are</h1>
	<div>
		<table border="1">
			<tr>
				<td>User name</td>
				<td>Fathername</td>
				<td>phone</td>
				<td>email</td>
				<td>City</td>
				<td>State</td>
				<td>Pincode</td>
           </tr>
			
			<% 
	 List<User> userobj=(List<User>) request.getAttribute("details") ;
	 for(User myusers : userobj){
	 %>
			<tr>
				<td><%= myusers.getUsername() %></td>
				<td><%= myusers.getFathername()  %></td>
				
				<td><%= myusers.getPhone()  %></td>
				<td><%= myusers.getEmail() %></td>
				<td><%= myusers.getCity() %></td>
				<td><%= myusers.getState() %></td>
				<td><%= myusers.getPincode() %></td>

			</tr>

    <%
	 }
	%>
	</table>

	</div>
</body>
</html>