package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta conta1 = new ContaCorrente(11, 352);
		Conta conta2 = new ContaCorrente(12, 785);
		
		guardador.adiciona(conta1);
		guardador.adiciona(conta2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getConta(0);
		System.out.println(ref.getNumero());
		
		//guardador.mostra();
	}
}
