package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.GuardadorDeObjetos;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaJavaLang {
	
	public static void main(String[] args) throws ValorInvalidoException {
		ContaCorrente c1 = new ContaCorrente();	
		c1.deposita(500);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(500);		
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		Conta c1NoArmario = (Conta) armario.pega(0);
		
		//System.out.println(c1NoArmario);
		
		String curso = "fj11";
		curso = curso.replace("j", "K");
		curso = curso.toUpperCase();
		
		//System.out.println(curso);
		
		double pi = 3.14;
		long numeroArredondado = Math.round(pi);
		//System.out.println(numeroArredondado);
		
		Conta conta = new ContaCorrente();
		System.out.println(conta);

	}
	
	
}
