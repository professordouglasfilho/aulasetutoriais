<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Lista de municipios</title>
	</head>
	<body>
		<c:forEach var="municipio" items="${listaDeMunicipios}">
			<div id="${municipio.posicao}">
				<p>Municipio: ${municipio.nome}</p>
				<p>Habitantes: ${municipio.habitantes}</p>
				<hr>
			</div>
		</c:forEach>
	</body>
</html>
