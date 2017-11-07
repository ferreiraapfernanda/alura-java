package br.com.empresa.banco.sistema;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaColecoes {

	public static void main(String[] args) throws ValorInvalidoException {
				
		Map<String, Conta> contas = new HashMap<String, Conta>();
		Conta c1 = new ContaPoupanca();
		Conta c2 = new ContaPoupanca();
		
		c1.deposita(200);
		c2.deposita(500);
		
		contas.put("Diretor", c1);
		contas.put("Gerente", c2);
		
		System.out.println(contas.get("Diretor").getSaldo());
		System.out.println(contas.get("Gerente").getSaldo());

	}
}
