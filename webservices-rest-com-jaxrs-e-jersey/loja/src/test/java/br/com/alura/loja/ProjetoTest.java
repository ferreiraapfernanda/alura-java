package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Test;

import junit.framework.Assert;

public class ProjetoTest {

	@Test
	public void testaGetPrimeiroProjeto() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/");
		String resultado = target.path("projetos").request().get(String.class);
		System.out.println(resultado);

		Assert.assertTrue(!resultado.isEmpty());
	}
}
