package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1337, 24226);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);

		conta.getTitular().setProfissao("Programador");

		System.out.println(conta.getTitular().getNome());
	}
}
