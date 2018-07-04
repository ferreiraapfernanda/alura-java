package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta conta1 = new ContaCorrente(11, 352);
		Conta conta2 = new ContaCorrente(12, 785);

		lista.add(conta1);
		lista.add(conta2);
		
		Conta conta3 = new ContaCorrente(12, 785);
		boolean existe = lista.contains(conta3);
		
		//existe = conta2.equals(conta1);
		
		System.out.println("Já existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
