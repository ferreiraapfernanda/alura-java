package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] contas = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
				
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		contas[1] = cc2;
		
		Cliente cliente = new Cliente();
		contas[2] = cliente;
		
		System.out.println(((Conta) contas[1]).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}
