package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void testaQueAConexaoComOServidorFunciona() {
		
		// Executar com Run As > JUnit Test

		// Cliente para acessar o servidor
		Client client = ClientBuilder.newClient();
		// URI base para as requisições
		WebTarget target = client.target("http://www.mocky.io");
		// Requisição específica
		String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);

		//System.out.println(conteudo);
		
		// Teste para saber se no conteudo recebido possui a string
		Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
	}

}
