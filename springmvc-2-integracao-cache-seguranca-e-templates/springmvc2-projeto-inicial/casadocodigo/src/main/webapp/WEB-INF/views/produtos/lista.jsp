<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>

<c:url value="/resources/css" var="cssPath" />
<link rel="stylesheet" href="${cssPath }/bootstrap.min.css" />

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
	<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Casa
		do Código</a>
	<ul class="nav navbar-nav mr-auto">
		<li class="nav-item"><a class="nav-link"
			href="${s:mvcUrl('PC#listar').build() }">Lista de Produtos</a></li>
		<li class="nav-item"><a class="nav-link"
			href="${s:mvcUrl('PC#form').build() }">Cadastro de Produtos</a></li>
	</ul>
	<ul class="nav navbar-nav navbar-right">
		<li class="nav-item"><security:authentication
				property="principal" var="usuario" /> Usuário: ${usuario.username }</li>
		<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
	</ul>
	</nav>

	<div class="container pt-4">

		<h1>Lista de Produtos</h1>

		<div>${sucesso }</div>
		<div>${falha }</div>

		<table class="table table-bordered table-striped table-hover">
			<tr>
				<th>Título</th>
				<th>Descrição</th>
				<th>Páginas</th>
			</tr>
			<c:forEach items="${produtos }" var="produto">
				<tr>
					<td><a
						href="${s:mvcUrl('PC#detalhe').arg(0, produto.id).build() }">${produto.titulo }</a>
					</td>
					<td>${produto.descricao }</td>
					<td>${produto.paginas }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>