package br.com.caelum.produtos.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.caelum.produtos.modelo.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class UsuarioDao {
	private final Session session;

	public UsuarioDao() {
		session = new HibernateUtil().openSession();
	}

	public Usuario buscaUsuarioPorLoginESenha(Usuario usuario) {
		Query query = this.session.createQuery("from Usuario where login = :pLogin and senha = :pSenha");
		query.setParameter("pLogin", usuario.getLogin());
		query.setParameter("pSenha", usuario.getSenha());
		return (Usuario) query.uniqueResult();
	}
}
