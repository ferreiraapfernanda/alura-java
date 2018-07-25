<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>

<c:url value="/resources/css" var="cssPath" />
<link rel="stylesheet" href="${cssPath }/bootstrap.min.css" />

</head>
<body class="d-flex flex-column">

	<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
	<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Casa do Código</a>
	<div>
		<ul class="nav">
			<li class="nav-item"><a class="nav-link"
				href="${s:mvcUrl('PC#listar').build() }">Lista de Produtos</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${s:mvcUrl('PC#form').build() }">Cadastro de Produtos</a></li>
		</ul>
	</div>
	</nav>

	<div class="container py-4">

		<h1>Cadastro de Produto</h1>

		<form:form action="${s:mvcUrl('PC#gravar').build() }" method="post"
			commandName="produto" enctype="multipart/form-data">
			<div class="form-group">
				<label>Título</label>
				<form:input path="titulo" cssClass="form-control" />
				<form:errors path="titulo" />
			</div>
			<div class="form-group">
				<label>Descrição</label>
				<form:textarea rows="10" cols="20" path="descricao"
					cssClass="form-control" />
				<form:errors path="descricao" />
			</div>
			<div class="form-group">
				<label>Páginas</label>
				<form:input path="paginas" cssClass="form-control" />
				<form:errors path="paginas" />
			</div>
			<div class="form-group">
				<label>Data de Lançamento</label>
				<form:input path="dataLancamento" cssClass="form-control" />
				<form:errors path="dataLancamento" />
			</div>
			<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
				<div class="form-group">
					<label>${tipoPreco}</label>
					<form:input path="precos[${status.index}].valor"
						cssClass="form-control" />
					<form:hidden path="precos[${status.index}].tipo"
						value="${tipoPreco}" />
				</div>
			</c:forEach>
			<div class="form-group">
				<label>Sumário</label> <input name="sumario" type="file" class="form-control"/>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form:form>

	</div>
</body>
</html>