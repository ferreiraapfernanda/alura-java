package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaConcorrencia {

	public static void main(String[] args) throws ValorInvalidoException, InterruptedException {
		
		/* BarraDeProgesso barra = new BarraDeProgesso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		t2.start(); */
		
		Conta c1 = new ContaCorrente();
		c1.deposita(500);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1.getSaldo());
		
	}
}
