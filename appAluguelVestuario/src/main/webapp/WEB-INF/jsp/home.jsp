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
	          <a class="nav-link" href="/calcado/lista">Cal�ado</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/acessorio/lista">Acess�rio</a>
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
		<h2>Projeto de Gest�o de Vestu�rio</h2>
		<p>Aluguel de roupas, cal�ados e acess�rios</p>
		
		<h3>Classe: Aluguel</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>ItemAlugado</td>
					<td>String</td>
					<td>Item de vestu�rio que est� sendo alugado</td>
				</tr>
				<tr class="info">
					<td>valorTotal</td>
					<td>double</td>
					<td>Valor total do item alugado</td>
				</tr>
				<tr class="warning">
					<td>dataEvento</td>
					<td>LocalDateTime</td>
					<td>Data de realiza��o do evento quando ser� usando o vestuario</td>
				</tr>
			</tbody>
		</table>
		<br>
		<h3>Classe: Cliente</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>Nome</td>
					<td>String</td>
					<td>Nome do Cliente</td>
				</tr>
				<tr class="info">
					<td>cpf</td>
					<td>String</td>
					<td>N�mero de Cadastro de Pessoa F�sica(CPF) do cliente</td>
				</tr>
				<tr class="warning">
					<td>dataNascimento</td>
					<td>LocalDateTime</td>
					<td>Data de nascimento do cliente</td>
				</tr>
			</tbody>
		</table>
		
		<br>
		<h3>Classe: Vestuario</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>nome</td>
					<td>String</td>
					<td>Nome do Vestu�rio</td>
				</tr>
				<tr class="info">
					<td>valorDoAluguel</td>
					<td>double</td>
					<td>Valor de aluguel da pe�a</td>
				</tr>
				<tr class="warning">
					<td>reservado</td>
					<td>boolean</td>
					<td>Indicatico se a pe�a j� est� reservada</td>
				</tr>
			</tbody>
		</table>
		
		<br>
		<h3>Classe: Roupa</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>tamanho</td>
					<td>String</td>
					<td>Tamanho da roupa (PP, P, M, G, GG)</td>
				</tr>
				<tr class="info">
					<td>tipoDeTecido</td>
					<td>String</td>
					<td>Qual o tipo de tecido da roupa</td>
				</tr>
				<tr class="warning">
					<td>paraNoite</td>
					<td>boolean</td>
					<td>Indicatico de roupa que � indicada apenas para eventos a noite</td>
				</tr>
			</tbody>
		</table>
		
		<br>
		<h3>Classe: Cal�ado</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>tamanho</td>
					<td>int</td>
					<td>Tamanho do tamanho do cal�ado</td>
				</tr>
				<tr class="info">
					<td>tipoDeSalto</td>
					<td>String</td>
					<td>Qual o tipo de salto do cal�ado</td>
				</tr>
				<tr class="warning">
					<td>cor</td>
					<td>String</td>
					<td>Cor do cal�ado</td>
				</tr>
			</tbody>
		</table>
		
		<br>
		<h3>Classe: Acess�rio</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descri��o</th>
				</tr>
			</thead>
			<tbody>
				<tr class="success">
					<td>descricao</td>
					<td>String</td>
					<td>Descri��o do acess�rio</td>
				</tr>
				<tr class="info">
					<td>tipo</td>
					<td>String</td>
					<td>Qual o tipo de acess�rio</td>
				</tr>
				<tr class="warning">
					<td>material</td>
					<td>String</td>
					<td>Qual o material do acess�rio</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>