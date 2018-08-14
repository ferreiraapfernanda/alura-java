package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.modelo.Projeto;

public class ClienteTest {

	private HttpServer servidor;

	@Before
	public void startaServidor() {
		servidor = Servidor.inicializaServidor();
	}

	@After
	public void mataServidor() {
		servidor.stop();
	}

	@Test
	public void testaQueBuscarUmCarrinhoTrazOCarrinhoEsperado() {

		// Executar com Run As > JUnit Test

		// Cliente para acessar o servidor
		Client client = ClientBuilder.newClient();
		// URI base para as requisições
		WebTarget target = client.target("http://localhost:8080/");
		// Requisição específica
		String conteudo = target.path("carrinhos/1").request().get(String.class);

		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);

		Assert.assertEquals(carrinho.getRua(), "Rua Vergueiro 3185, 8 andar");
	}

	@Test
	public void testaGetPrimeiroProjeto() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/");
		String resultado = target.path("projetos/1").request().get(String.class);

		Projeto projeto = (Projeto) new XStream().fromXML(resultado);

		Assert.assertEquals(projeto.getId(), 1l);
	}

	@Test
	public void testaPostCarrinho() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/");

		Carrinho carrinho = new Carrinho();
		carrinho.adiciona(new Produto(314l, "Tablet", 1000, 2));
		carrinho.setRua("Jayme Theodoro");
		carrinho.setCidade("Sorocaba");

		String xml = carrinho.toXML();

		// Representando que o tipo de dado é XML
		Entity<String> entity = Entity.entity(xml, MediaType.APPLICATION_XML);

		Response response = target.path("carrinhos").request().post(entity);
		
		Assert.assertEquals(response.getStatus(), 201);
		

	}

}
