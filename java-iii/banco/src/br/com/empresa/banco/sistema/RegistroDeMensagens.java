package br.com.empresa.banco.sistema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class RegistroDeMensagens {
	
	public static void main(String[] args) throws InterruptedException {
		
		Collection<String> mensagens = new LinkedList<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 1000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(1000, 2000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(2000, 3000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de mensagens finalizadas!");
		
		for(int i =0;i<1500;i++) {
			if(!mensagens.contains("Mensagem " + i)) {
				throw new IllegalStateException("não encontrei a mensagem " + i);
			}
		}
		
		if(mensagens.contains(null)) {
			throw new IllegalStateException("não deveria ter null aqui dentro!");
		}
		
		System.out.println("Fim da execudao com sucesso");
		
		
	}

}
