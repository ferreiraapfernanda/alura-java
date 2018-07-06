<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<br />
	
	<c:if test="${not empty usuarioLogado}">
		Logado como ${usuarioLogado.email} </br>
	</c:if>
	
	<h1>Cadastrar Empresa</h1>
	<form action="novaEmpresa" method="post">
		Nome: <input type="text" name="nome"> <input type="submit"
			value="Enviar">
	</form>


	<form action="login" method="post">
		Email: <input type="email" name="email"> Senha: <input
			type="password" name="senha"> <input type="submit"
			value="Logar">
	</form>
	
	<form action="fazTudo" method="post">
		<input type="hidden" name="tarefa" value="Logout">
		<input type="submit" value="Deslogar">
	</form>
</body>
</html>