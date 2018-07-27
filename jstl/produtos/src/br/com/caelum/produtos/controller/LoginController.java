package br.com.caelum.produtos.controller;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.caelum.produtos.component.UsuarioLogado;
import br.com.caelum.produtos.dao.HibernateUtil;
import br.com.caelum.produtos.dao.UsuarioDao;
import br.com.caelum.produtos.modelo.Produto;
import br.com.caelum.produtos.modelo.Usuario;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class LoginController {
	private UsuarioDao dao;
	private UsuarioLogado usuarioLogado;
	private Result result;

	public LoginController(UsuarioDao dao, UsuarioLogado usuarioLogado,	Result result) {
		this.dao = dao;
		this.usuarioLogado = usuarioLogado;
		this.result = result;
	}
	
	public void autentica(Usuario usuario){
		Usuario autenticado = dao.buscaUsuarioPorLoginESenha(usuario);
		if (autenticado != null){
			usuarioLogado.efetuaLogin(autenticado);
			result.redirectTo(ProdutoController.class).lista();
			return;
		}
		result.redirectTo(LoginController.class).formulario();
	}
	
	private static void criaUsuarioEProduto() {
		Usuario usuario = new Usuario();
		usuario.setLogin("teste");
		usuario.setSenha("teste");
		Session session = new HibernateUtil().openSession();
		session.beginTransaction();
		session.save(usuario);
		session.save(produto("Geladeira", "Geladeira linda", 500.0, true));
		session.save(produto("Fogão", "Brastemp", 250.4, false));
		session.save(produto("XBOX", "Videogame da Microsoft", 150.0, true));
		session.save(produto("Celular Samsung", "S3 Novo em folha", 1500.0, false));
		
		session.getTransaction().commit();
		session.close();

	}

	private static Produto produto(String nome, String descricao, double preco, boolean usado) {
		Produto produto = new Produto();
		produto.setDataInicioVenda(Calendar.getInstance());
		produto.setDescricao(descricao);
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setUsado(usado);
		return produto;
	}

	public void formulario() {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Usuario.class);
		new SchemaExport(cfg).create(true, true);
		criaUsuarioEProduto();
	}
	
}
