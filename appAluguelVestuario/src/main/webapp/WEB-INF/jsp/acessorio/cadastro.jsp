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

	<div class="container mt-3">
	  <h2>Cadastro de Acessorios</h2>
	  <form action="/acessorio/incluir" method="post">
	    <c:import url="/WEB-INF/jsp/vestuario/cadastro.jsp"/>
	    
	    <div class="mb-3 mt-3">
	      <label>Descri��o:</label>
	      <input type="text" class="form-control" id="descricao" placeholder="Entre com a descri��o" name="descricao">
	    </div>
	    
	    <div class="mb-3">
	      <label>Tipo:</label>
	      <input type="text" class="form-control" id="tipo" placeholder="Entre com o tipo de acess�rio" name="tipo">
	    </div>
	    
	    <div class="mb-3">
	      <label>Material:</label>
	      <input type="text" class="form-control" id="Material" placeholder="Entre com o material do acess�rio" name="material">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Incluir</button>
	  </form>
	</div>

</body>
</html>