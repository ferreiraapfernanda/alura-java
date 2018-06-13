package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMaticula;

	public Aluno(String nome, int numeroMaticula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMaticula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMaticula != other.numeroMaticula)
			return false;
		return true;
	}
	
}
