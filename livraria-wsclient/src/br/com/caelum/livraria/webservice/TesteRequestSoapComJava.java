package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		LivrariaWS cliente = new LivrariaWSProxy();

		Livro[] livros = cliente.getLivrosPeloNome("Livro");

		for (Livro livro : livros) {

			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}

	}

}
