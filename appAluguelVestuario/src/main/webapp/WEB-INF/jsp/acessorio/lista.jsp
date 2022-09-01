<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>AppAluguelVestuario</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<h2>Projeto de Gest�o de Vestu�rio</h2>
		<p>Aluguel de roupas, cal�ados e acess�rios</p>
		
		<h3>Classe: Acess�rio</h3>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Valor do aluguel</th>
					<th>Quantidade de dias</th>
					<th>Descri��o</th>
					<th>Tipo</th>
					<th>Material</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${listagem}">
				<tr class="success">
					<td>${a.id}</td>
					<td>${a.nome}</td>
					<td>${a.valorDoAluguel}</td>
					<td>${a.qtdDias}</td>
					<td>${a.descricao}</td>
					<td>${a.tipo}</td>
					<td>${a.material}</td>
					<td><a href="/acessorio/${a.id}/excluir">excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>