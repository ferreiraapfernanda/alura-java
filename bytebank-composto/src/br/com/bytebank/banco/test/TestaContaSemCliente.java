package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new ContaCorrente(1010, 2020);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());
		contaDaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaDaMarcela.getTitular().getNome());
	}
}
