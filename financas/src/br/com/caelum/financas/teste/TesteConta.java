package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta(); // Esse objeto não será managed, pois não foi persistido
		conta.setId(1);
		conta.setTitular("Leonardo");
		conta.setAgencia("123");
		conta.setBanco("Caixa Economica");
		conta.setNumero("456");

		// A classe persistence representa o arquivo persistence.xml
		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();
		conta = em.find(Conta.class, 1); // Esse objeto será managed
		em.remove(conta);
		
		conta.setBanco("Bradesco");
		
		em.getTransaction().commit();

		em.close();
	}
}
