<%@page import="br.com.caelum.produtos.modelo.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<script type="text/javascript" src="<c:url value="/js/jquery.js"/>"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function removeProduto(id){
			$("#mensagem").load('<c:url value="/produto/remove"/>' + '?produto.id=' + id);
			$("#produto" + id).remove();
		}
	</script>

	<h1>Produtos</h1>
	<div id="mensagem"></div>
	<table width="100%">
		<tr>
			<td width="20%">No.</td>
			<td width="20%">Nome</td>
			<td>Preco</td>
			<td>Descricao</td>
			<td>Data de Inicio da Venda</td>
			<td>Usado?</td>
			<td width="20%">Remover?</td>
		</tr>

		<c:forEach var="p" items="${produtoList}" varStatus="st">

			<tr id="produto${p.id}>">

				<td>${st.count}</td>
				<td>${p.nome}</td>
				<td>${p.preco}</td>
				<td>${p.descricao}</td>
				<td>${p.dataInicioVenda.time}</td>

				<!--<c:if test="${p.usado }">
					<td>Sim</td>
				</c:if>
				<c:if test="${not p.usado }">
					<td>Não</td>
				</c:if> -->

				<c:choose>
					<c:when test="${p.usado}">
						<td>Sim</td>
					</c:when>
					<c:otherwise>
						<td>Não</td>
					</c:otherwise>
				</c:choose>

				<td><a href="#" onclick="return removeProduto(${p.id})">Remover</a></td>

			</tr>
		</c:forEach>
	</table>
	<a href="/produtos/produto/formulario">Adicionar um produto</a>
</body>
</html>