package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.setNumero(10);
		conta2.setNumero(10);
		
		if(conta1.equals(conta2)) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
		if(conta1 == conta2) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
	}

}
