<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String result=request.getParameter("result");
String submit=request.getParameter("submit");
if(submit.equals("add"))
submit="Addition";
else
submit="Substraction";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body bgcolor="cyan">
${empty "Hello"}
<center>
    Operation: <%= submit %> <br>
    Result: <%=result%>
</center>
<jsp:include page="/index.jsp"/>


</body>
</html>