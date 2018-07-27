<%@ page import="br.com.caelum.produtos.modelo.Produto"%>
<%@ page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
<meta http-equiv="Content-Type" content="text/html">
<meta charset="utf-8">

<title>Insert title here</title>

<script type="text/javascript" src="<c:url value="/js/jquery.js"/>"></script>
<script type="text/javascript">
  	function removeProduto(id){
  		$("#mensagem").load('<c:url value="/produto/remove"/>' + '?produto.id=' + id);
  		$("#produto" + id).remove();
  	}
  </script>
</head>
<body>

  <h1>Produtos</h1>
  
  <h2><fmt:message key="mensagem.bemvindo"/></h2>

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
        <td>${p.nome.toUpperCase()}</td>
        <td><fmt:formatNumber value="${p.preco}" type="currency" /></td>
        <td>${p.descricao}</td>
        <td><fmt:formatDate value="${p.dataInicioVenda.time}" pattern="dd/MM/yyyy" /></td>

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

  <!--<c:set var="nome" value="João da Silva" />
  <c:out value="${nome}" />-->

  <a href="<c:url value="/produto/formulario"/>"><fmt:message key="mensagem.novoProduto"/></a>

</body>
</html>