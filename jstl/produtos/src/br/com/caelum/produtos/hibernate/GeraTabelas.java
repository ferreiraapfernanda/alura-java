package br.com.caelum.produtos.hibernate;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.produtos.dao.HibernateUtil;
import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.produtos.modelo.Usuario;

public class GeraTabelas {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Usuario.class);
		new SchemaExport(cfg).create(true, true);
		criaUsuarioEProduto();
	}

	private static void criaUsuarioEProduto() {
		Usuario usuario = new Usuario();
		usuario.setLogin("teste");
		usuario.setSenha("teste");
		Session session = new HibernateUtil().openSession();
		session.beginTransaction();
		session.save(usuario);
		Produto produto = new Produto();
		produto.setDataInicioVenda(Calendar.getInstance());
		produto.setDescricao("Descricao de teste");
		produto.setNome("Teste");
		produto.setPreco(20.5);
		session.save(produto);
		session.getTransaction().commit();
		session.close();

	}

}
