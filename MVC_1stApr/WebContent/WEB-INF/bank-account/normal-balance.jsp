<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<table border=5 align="center">
<tr><th class="TITLE">Your Balance</table>
<p>
<img align="right" src="./bank-support/money.gif">

First name: ${customer.firstName}<br>
Last name: ${customer.lastName}<br>
ID: ${customer.id}<br>
Balance: $${customer.balanceNoSign}<br>
</body>
</html>