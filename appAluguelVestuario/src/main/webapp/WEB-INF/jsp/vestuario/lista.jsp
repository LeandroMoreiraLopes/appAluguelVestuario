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
		
		<h3>Classe: Vestuario</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Valor do aluguel</th>
					<th>Quantidade de dias</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>Roupa</td>
					<td>R$ 500,00 - 2000,00</td>
					<td>1-7</td>
				</tr>
				<tr class="info">
					<td>Cal�ado</td>
					<td>R$ 50,00-350</td>
					<td>1-7</td>
				</tr>
				<tr class="warning">
					<td>Acess�rio</td>
					<td>R$ 10,00-300,00</td>
					<td>1-3</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>