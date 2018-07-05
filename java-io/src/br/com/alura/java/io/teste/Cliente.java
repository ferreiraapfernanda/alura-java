package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank
 * 
 * @author fernanda
 * @version 1.0
 *
 */
public class Cliente implements Serializable{

	/**
	 * Colocar uma versão. O ideal é que mude somente se alterar algo muito importante, que pode ser incompatível
	 */
	private static final long serialVersionUID = 4L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public Cliente() {

	}
	
	public String getNomeCpf() {
		return this.nome + ", " + this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
