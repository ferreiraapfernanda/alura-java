package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
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
	private Client client;

	@Before
	public void startaServidor() {
		servidor = Servidor.inicializaServidor();

		ClientConfig config = new ClientConfig();
		config.register(new LoggingFilter());
		this.client = ClientBuilder.newClient(config);
	}

	@After
	public void mataServidor() {
		servidor.stop();
	}

	@Test
	public void testaQueBuscarUmCarrinhoTrazOCarrinhoEsperado() {

		// URI base para as requisições
		WebTarget target = client.target("http://localhost:8080/");
		// Requisição específica
		Carrinho carrinho = target.path("carrinhos/1").request().get(Carrinho.class);

		Assert.assertEquals(carrinho.getRua(), "Rua Vergueiro 3185, 8 andar");
	}

	@Test
	public void testaGetPrimeiroProjeto() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/");
		Projeto projeto = target.path("projetos/1").request().get(Projeto.class);

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

		// Representando que o tipo de dado é XML
		Entity<Carrinho> entity = Entity.entity(carrinho, MediaType.APPLICATION_XML);

		Response response = target.path("carrinhos").request().post(entity);

		Assert.assertEquals(response.getStatus(), 201);

	}
	
	@Test
    public void testaQueSuportaNovosCarrinhos(){
        WebTarget target = client.target("http://localhost:8080");
        Carrinho carrinho = new Carrinho();
        carrinho.adiciona(new Produto(314L, "Tablet", 999, 1));
        carrinho.setRua("Rua Vergueiro");
        carrinho.setCidade("Sao Paulo");

        Entity<Carrinho> entity = Entity.entity(carrinho, MediaType.APPLICATION_XML);
        Response response = target.path("/carrinhos").request().post(entity);
        Assert.assertEquals(201, response.getStatus());
    }

}
