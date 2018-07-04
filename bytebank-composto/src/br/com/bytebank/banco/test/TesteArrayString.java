package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		
		System.out.println("Funcionou");
		
		for (String string : args) {
			System.out.println(string);
		}
		
	}
}
