package br.com.caelum.produtos.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.produtos.modelo.Usuario;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(Produto.class);
		configuration.addAnnotatedClass(Usuario.class);
		sessionFactory = configuration.buildSessionFactory();

	}

	public Session openSession() {
		return sessionFactory.openSession();
	}
}