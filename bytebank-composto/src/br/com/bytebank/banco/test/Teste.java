package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(22, 33); 
		Cliente cliente = new Cliente();

		System.out.println(cc);
		System.out.println(cp);
		
		//println(cc.getValorImposto());
	}
	
	static void println(Object a) {
		
	}
}
