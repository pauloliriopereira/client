<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	    <title>Produto busca</title>
	    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="/">HOME</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item active">
						<a class="nav-link" href="/buscar">Pesquisar Produtos<span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item active">
						<a class="nav-link" href="/">Cadastar Produtos<span class="sr-only">(current)</span></a>
					</li>
				</ul>
			</div>
		</nav>
    <div id="lista" class="container">
    	<form action="buscarProdutoPorId" method="post">
	    	<h2>Inserir dados para Busca</h2>
				<div class="form-group">
					<label for="id">Nº do id</label> 
					<input type="text" class="form-control" id="id" name="id" placeholder="Nº do id">
				</div>
				<button type="submit" class="btn btn-success">Buscar Produto</button>
			</form>
			<form action="listar" method="post">
	    	<h2>Listar todos os produtos</h2>
				<button type="submit" class="btn btn-success">Listar Produtos</button>
			</form>
 		</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>