package br.com.empresa.banco.sistema;

import java.util.HashSet;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaHashSetConta {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaCorrente();
		Conta c4 = new ContaCorrente();
		Conta c5 = new ContaCorrente();
		
		
		c1.setNumero(1000);
		c2.setNumero(2000);
		c3.setNumero(1100);
		c4.setNumero(400);
		c5.setNumero(1000);
		
		HashSet<Conta> contas = new HashSet();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		for(Conta conta : contas) {
			System.out.println(conta.getNumero());
		}
	}
	
}
