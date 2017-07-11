<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL</title>
</head>
<body>
<%-- <c:out value="Hi There!!"></c:out>
<c:set var="salary" value="${200}" scope="session"/>
<c:choose>
<c:when test="${salary<1000}">

<h2>With Salary $<c:out  value="${salary}"/> is less to survive</h2>
</c:when>
<c:when test="${salary>=1000 && salary < 3000 }">
<h2> With Salary $<c:out  value="${salary}"/> , just able to survive</h2>
</c:when>
<c:otherwise>
<h3><font color="red"> <b>I'm fine with my salary</b></font> </h3>
</c:otherwise>
</c:choose> --%>

<% 
String[] arr = new String[] {"dog", "cat", "pig", "cow", "horse", "rhino", "hippo","dog", "cat", "pig", "cow", "horse", "rhino", "hippo"};
application.setAttribute("arrayAttribute", arr); 
%> 
<table border="1"> 
<c:forEach var="element" items="${arrayAttribute}" varStatus="c" begin="0" end="10" step="2">
<tr><td>${c.count}</td> 
<td>${element}</td></tr> 
</c:forEach> </table>
<%-- <c:redirect url="http://www.google.com"/> --%>
</body>
</html>