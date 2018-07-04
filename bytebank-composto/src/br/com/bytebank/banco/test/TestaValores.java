package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(1337, 24226);
		Conta conta2 = new ContaCorrente(1337, 14679);
		Conta conta3 = new ContaCorrente(1337, 45866);

		System.out.println(Conta.getTotal());
	}
}
