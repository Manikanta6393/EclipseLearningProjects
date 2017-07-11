<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sub</title>
</head>
<body>
<%
int a1=0,a2=0,result=0;
try{
 a1=Integer.parseInt(request.getParameter("p1"));
 a2=Integer.parseInt(request.getParameter("p2"));
 result=a1-a2;
}
catch(NumberFormatException e){ System.out.println("Invalid Data");}
%>
<jsp:forward page="/result.jsp">
	<jsp:param name="result"  value="<%=result%>"/> 
</jsp:forward>

</body>
</html>