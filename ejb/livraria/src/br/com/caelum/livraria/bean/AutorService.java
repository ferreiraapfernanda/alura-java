package br.com.caelum.livraria.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	AutorDao dao;

	public void adiciona(Autor autor) {
		// Mais regras de negócio
		
		dao.salva(autor);
	}

	public List<Autor> todosAutores() {
		return dao.todosAutores();
	}
}
