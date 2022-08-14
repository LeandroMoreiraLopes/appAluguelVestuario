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
	
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">AppAluguelDeRoupas</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="collapsibleNavbar">
	      <ul class="navbar-nav">
	        <li class="nav-item">
	          <a class="nav-link" href="/">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/roupa/lista">Roupa</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/calcado/lista">Calçado</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/acessorio/lista">Acessório</a>
	        </li>  
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Servicos</a>
	          <ul class="dropdown-menu">
	            <li><a class="dropdown-item" href="/aluguel/lista">Aluguel</a></li>
	            <li><a class="dropdown-item" href="/vestuario/lista">Vestuario</a></li>
	            <li><a class="dropdown-item" href="/cliente/lista">Cliente</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container">
		<h2>Projeto de Gestão de Vestuário</h2>
		<p>Aluguel de roupas, calçados e acessórios</p>
		
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
					<td>Calçado</td>
					<td>R$ 50,00-350</td>
					<td>1-7</td>
				</tr>
				<tr class="warning">
					<td>Acessório</td>
					<td>R$ 10,00-300,00</td>
					<td>1-3</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>