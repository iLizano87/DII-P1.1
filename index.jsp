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
	<div id="frame">
		<form action="Form" method="post">

			<p id="title">Desarrollo de interfaces/P1.1</p>
			<hr>
			<br /> <br /> <label class="formtitle">Nombre de usuario</label> <br />
			<br /> 
			<!-- Si el usuario envia formulario y contraseñas no son validas, muestra de nuevo el usuario introducido en el campo -->
			<input type="text"
				<%String user_old = (String) request.getAttribute("user_old");
			if (user_old != null && !user_old.equals("")) {
				out.print("value='" + user_old + "'");
			}%>
				class="camp" name="nombre" /> 
				<!-- muestra div ERROR si nombre está vacío -->
				<div id=error>
			<%
				String error_name = (String) request.getAttribute("error_name");
				if (error_name != null && !error_name.equals("")) {
					out.println(error_name);
				}
			%></div> <br /> <label
				class="formtitle">Introduzca contraseña</label> <br /> <br /> <input
				type="password" class="camp" name="pass" /> <br /> <br /> <label
				class="formtitle">Confirme contraseña</label> <br /> <br /> <input
				type="password" class="camp" name="pass2" /> <br /> <br />
				<!-- muestra div ERROR si contraseñas no coinciden o vacías -->
				<div id=error>
			<%
				String error_pass = (String) request.getAttribute("error_pass");
				if (error_pass != null && !error_pass.equals("")) {
					out.println(error_pass);
				}
			%></div>
				 <br />
				
			<input type="submit" value="Enviar" id="send" />
		</form>
		<br /> <br />
		<p id="foot">Iván Lizano Martín</p>
	</div>
</body>
</html>