package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeObjects;

public class TesteGuardadorDeObjects {

	public static void main(String[] args) {

		GuardadorDeObjects guardador = new GuardadorDeObjects(10);

		Conta conta1 = new ContaCorrente(11, 352);
		Conta conta2 = new ContaCorrente(12, 785);

		guardador.adiciona(conta1);
		guardador.adiciona(conta2);

		int tamanho = guardador.getQuantidade();
		System.out.println(tamanho);

		Conta ref = (Conta) guardador.getObject(0);
		System.out.println(ref.getNumero());

	}
}
