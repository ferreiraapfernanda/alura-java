package br.com.alura.java2.main;

import br.com.alura.java2.modelos.Conta;
import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.ContaPoupanca;
import br.com.alura.java2.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}
