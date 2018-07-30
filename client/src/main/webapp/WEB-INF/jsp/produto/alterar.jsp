<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	    <title>ALtear produto busca</title>
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
    	<form action="alterarProduto" method="post">
       <div id="formulario" class="jumbotron" align="center" style="margin-top: 50px;">
        <h2>Deseja alterar o produto cadastrado abaixo</h2>
        <div class="form-group">
					<label for="id">Id</label> 
					<input type="text" value="${produtoAlterar.id}" class="form-control" id="id" name="id" placeholder="Id">
				</div>
	      <div class="form-group">
					<label for="nome">Nome</label> 
					<input type="text" value="${produtoAlterar.nome}" class="form-control" id="nome" name="nome" placeholder="Nome">
				</div>
				<div class="form-group">
					<label for="preco">Preço</label> 
					<input type="text" value="${produtoAlterar.preco}"  class="form-control" id="preco" name="preco" placeholder="preco">
				</div>
				<div class="form-group">
					<label for="quantidade">Quantidade</label> 
					<input type="text" value="${produtoAlterar.quantidade}" class="form-control" id="quantidade" name="quantidade" placeholder="quantidade">
				</div>
				<button type="submit" class="btn btn-success">Alterar</button>
       </div>
     </form>
 		</div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
	</body>
</html>