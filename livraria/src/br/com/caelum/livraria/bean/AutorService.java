package br.com.caelum.livraria.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	AutorDao dao;

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void adiciona(Autor autor) {
		// Mais regras de negócio

		dao.salva(autor);

		throw new RuntimeException("[ERRO] Erro lançado para testar o rollback da transação.");
	}

	public List<Autor> todosAutores() {
		return dao.todosAutores();
	}
}
