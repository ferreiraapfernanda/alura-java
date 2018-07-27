package br.com.caelum.produtos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class ProdutoDao {

	private final Session session;

	public ProdutoDao() {
		this.session = new HibernateUtil().openSession();
	}

	public void adiciona(Produto p) {
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
	}

	public void atualiza(Produto p) {
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
	}

	public void remove(Produto p) {
		Transaction tx = session.beginTransaction();
		session.delete(p);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> lista() {
		return session.createCriteria(Produto.class).list();
	}

}