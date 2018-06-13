package br.com.empresa.banco.conta;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	
	Map<String, Conta> contas = new HashMap<String, Conta>();
	
	public void adiciona(Conta conta) {
		contas.put(conta.getNome(), conta);		
	}
	
	public int pegQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return contas.get(nome);
	}

}
