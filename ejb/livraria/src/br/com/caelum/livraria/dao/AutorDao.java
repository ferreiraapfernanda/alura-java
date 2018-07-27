package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;


public class AutorDao {

	private Banco banco = new Banco();

	public void salva(Autor autor) {
		banco.save(autor);
	}
	
	public List<Autor> todosAutores() {
		return banco.listaAutores();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.banco.buscaPelaId(autorId);
		return autor;
	}
	
}
