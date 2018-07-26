<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<c:url value="/" var="contextPath" />

<tags:pageTemplate titulo="Seu carrinho de compra">

<jsp:attribute name="extraScripts">
   <script> console.log("Finalização de compra de ${carrinhoCompras.quantidade} itens"); </script>
</jsp:attribute>

<jsp:body>
	<section class="container middle">
		<h2 id="cart-title">Seu carrinho de compras</h2>
		<table id="cart-table">
			<colgroup>
				<col class="item-col" />
				<col class="item-price-col" />
				<col class="item-quantity-col" />
				<col class="line-price-col" />
				<col class="delete-col" />
			</colgroup>
			<thead>
				<tr>
					<th class="cart-img-col"></th>
					<th width="65%">Item</th>
					<th width="10%">Preço</th>
					<th width="10%">Quantidade</th>
					<th width="10%">Total</th>
					<th width="5%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${carrinhoCompras.itens }" var="item">
					<tr>
						<td class="cart-img-col"><img src="http://cdn.shopify.com/s/files/1/0155/7645/products/css-eficiente-featured_large.png?v=1435245145"
							width="71px" height="100px" />
						</td>
						<td class="item-title">${item.produto.titulo }</td>
						<td class="numeric-cell">${item.preco }</td>
						<td class="quantity-input-cell">
								<input type="number" readonly="readonly" min="0" id="quantidade" name="quantidade" value="${carrinhoCompras.getQuantidade(item) }" />
						</td>
						<td class="numeric-cell" >${carrinhoCompras.getTotal(item) }</td>
						<td class="remove-item">
							<form:form action="${s:mvcUrl('CCC#remover').arg(0, item.produto.id).arg(1,item.tipoPreco).build() }" method="POST">
								<input type="image" src="${contextPath }resources/imagens/excluir.png" 
									alt="Excluir" title="Excluir" />
							</form:form>	
						</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="4">
						<form:form action="${s:mvcUrl('PC#finalizar').build() }" method="post">
							<input type="submit" class="checkout" name="checkout" value="Finalizar compra" />
						</form:form>					
					</td>
					<td class="numeric-cell">${carrinhoCompras.total }</td>
					<td></td>
				</tr>
			</tfoot>
		</table>

		<h2>Você já conhece os outros livros da Casa do Código?</h2>
		<ul id="collection" class="related-books">
			<li class="col-left"><a href="/products/livro-plsql" class="block clearfix book-suggest"
				data-book="PL/SQL: Domine a linguagem do banco de dados Oracle"> <img width="113px" height="160px"
					src="http:////cdn.shopify.com/s/files/1/0155/7645/products/plsql-featured_compact.png?v=1434740236"
					alt="PL/SQL: Domine a linguagem do banco de dados Oracle" />
			</a></li>
		</ul>

		<h2>
			<a href="${s:mvcUrl('HC#index').build() }">Veja todos os livros que publicamos!</a>
		</h2>
	</section>
</jsp:body>

</tags:pageTemplate>