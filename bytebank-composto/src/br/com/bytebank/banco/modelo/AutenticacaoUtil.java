package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class AutenticacaoUtil implements Serializable {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		}

		return false;
	}
}
