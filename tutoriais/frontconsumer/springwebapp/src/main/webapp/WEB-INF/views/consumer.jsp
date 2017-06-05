<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Consumindo o XML do serviço</title>
		<script src="https://code.jquery.com/jquery-3.2.1.js" 
				integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE=" 
				crossorigin="anonymous"></script>
	</head>
	<body>
		<div id="retorno_do_servico">
			
		</div>
		<script type="text/javascript">
			$(document).ready(function(){
				var url = "http://localhost:8080/springwebapp/getMunicipios?token=senha12345";
				var dataType = "xml";
				
				$.get(url, function(xml){
					var municipios = $(xml).find('municipios').children();
					$(municipios).each(function(){
						var posicao = $(this).find("posicao").text();
						var nome = $(this).find("nome").text();
						var habitantes = $(this).find("habitantes").text();

						var texto = "<div>"+
									"	<p><strong>Posição</strong>: "+posicao+"</p>"+
									"	<p><strong>Nome</strong>: "+nome+"</p>"+
									"	<p><strong>Habitantes</strong>: "+habitantes+"</p>"+
									"</div><hr>";

						$("#retorno_do_servico").append(texto);
					});
				}, dataType);
			});
		</script>
	</body>
</html>