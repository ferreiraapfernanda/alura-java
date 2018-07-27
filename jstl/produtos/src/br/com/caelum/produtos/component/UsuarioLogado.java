package br.com.caelum.produtos.component;

import br.com.caelum.produtos.modelo.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class UsuarioLogado {
	private Usuario usuarioLogado;
	
	public void efetuaLogin(Usuario usuario){
		this.usuarioLogado = usuario;
	}

	public Usuario getUsuario() {
		return usuarioLogado;
	}
}
