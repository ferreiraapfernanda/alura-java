<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais -
	Casa do Código</title>
</head>
<body>

	<form:form action="${s:mvcUrl('PC#gravar').build()}" method="post"
		commandName="produto">

		<div>
			<label>Título</label> <input type="text" name="titulo">
			<form:errors path="titulo"></form:errors>
		</div>
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
			<form:errors path="descricao"></form:errors>
		</div>
		<div>
			<label>Páginas</label> <input type="text" name="paginas">
			<form:errors path="paginas"></form:errors>
		</div>

		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label> <input type="text"
					name="precos[${status.index}].valor"> <input type="hidden"
					name="precos[${status.index}].tipo" value="${tipoPreco}">
			</div>

		</c:forEach>


		<button type="submit">Cadastrar</button>
	</form:form>

</body>
</html>