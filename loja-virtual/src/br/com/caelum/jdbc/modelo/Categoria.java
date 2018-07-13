package br.com.caelum.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int id;
	private String nome;
	private final List<Produto> produtos;

	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
		
		produtos = new ArrayList<Produto>();
	}

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public void adiciona(Produto p) {
		produtos.add(p);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

}
