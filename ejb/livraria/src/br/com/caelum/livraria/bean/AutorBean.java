package br.com.caelum.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.caelum.livraria.modelo.Autor;

@Model
public class AutorBean {
	
	private Autor autor = new Autor();
	
	@Inject
	private AutorService service;
	
	public Autor getAutor() {
		return autor;
	}
	
	public void cadastra() {
		this.autor = new Autor();
	}
	
	public List<Autor> getAutores() {
		return this.service.todosAutores();
	}
}
