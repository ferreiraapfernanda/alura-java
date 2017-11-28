package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMaticula;

	public Aluno(String nome, int numeroMaticula) {
		super();
		this.nome = nome;
		this.numeroMaticula = numeroMaticula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMaticula() {
		return numeroMaticula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMaticula + "]";
	}

}
