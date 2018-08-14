package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;

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
		String conteudo = target.path("carrinhos").request().get(String.class);

		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);

		Assert.assertEquals(carrinho.getRua(), "Rua Vergueiro 3185, 8 andar");
	}

}
