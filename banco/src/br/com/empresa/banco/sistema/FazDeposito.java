package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class FazDeposito implements Runnable {
	
	private final Conta conta;

	public FazDeposito (Conta conta) {
		this.conta = conta;
	}

	@Override
	public void run() {
		try {
			conta.deposita(100);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
}
