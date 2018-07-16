package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncaoMax {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 2);
		
		Query query = em.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta");
		query.setParameter("pConta", conta);
		
		BigDecimal maximo = (BigDecimal) query.getSingleResult();
		
		System.out.println(maximo);
	}
}
