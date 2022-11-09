<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DII P1.1 Iván Lizano Martín</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!-- muestra nombre y contraseña -->
<p class=ok> Hola <%=request.getParameter("nombre")%> </p>
<p class=ok>Tu contraseña es: <%=request.getParameter("pass")%></p>
</body>
</html>