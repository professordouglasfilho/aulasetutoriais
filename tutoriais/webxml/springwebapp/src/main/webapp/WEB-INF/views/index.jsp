<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Bem vindo � fuctura</title>
	</head>
	<body>
		<h1>Bem vindo � fuctura ${nome}</h1><br>
		<h4>Digite seu nome</h4>
		<form method="post" action="mostraBemVindo">
			<input type="text" name="nome">
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>