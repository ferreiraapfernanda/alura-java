package br.com.empresa.banco.sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	
	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca();
		ContaPoupanca conta2 = new ContaPoupanca();
		ContaPoupanca conta3 = new ContaPoupanca();
		ContaPoupanca conta4 = new ContaPoupanca();
		
		conta1.deposita(100);
		conta2.deposita(50);
		conta3.deposita(3500);
		conta4.deposita(185);
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		for(int i = 0; i < 10; i++) {
			
			ContaPoupanca conta = new ContaPoupanca();
			conta.setNumero(new Random().nextInt(2000));
			conta.deposita(new Random().nextInt(10000));
			contas.add(conta);
						
		}
		
		Collections.sort(contas);
		
		for (ContaPoupanca conta : contas) {
            System.out.println(conta.getNumero());
        }
		
		System.out.println(contas);
		
	}
}
