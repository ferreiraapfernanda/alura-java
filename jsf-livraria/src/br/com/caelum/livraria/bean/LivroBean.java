package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	
	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println(String.format("Gravando livro '%s'", this.livro.getTitulo()));
	}
}
