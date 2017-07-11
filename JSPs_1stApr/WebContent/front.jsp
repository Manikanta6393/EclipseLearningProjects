<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Front</title>
</head>
<%
	String submit=request.getParameter("submit");
  %>

<body>
<% if(submit.equals("add")){ %>
   <jsp:forward page="/add.jsp"/>
 <%} else if(submit.equals("sub")){ %>
   <jsp:forward page="/sub.jsp"/>
 <% } else{ %>
 <jsp:forward page="/index.jsp"/>
<%}%>

</body>
</html>