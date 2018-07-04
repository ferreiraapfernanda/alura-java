package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta conta1 = new ContaCorrente(11, 352);
		Conta conta2 = new ContaCorrente(12, 785);

		lista.add(conta1);
		lista.add(conta2);
		
		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println("Conta: " + ref.getNumero());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta conta3 = new ContaCorrente(11, 7854);
		Conta conta4 = new ContaCorrente(12, 986);

		lista.add(conta3);
		lista.add(conta4);

		System.out.println(lista);

		System.out.println("------------");

		for (Conta object : lista) {
			System.out.println(object);
		}

	}

}
