package br.com.caelum.livraria.dao;

import br.com.caelum.livraria.modelo.Usuario;


public class UsuarioDao {

	private Banco banco = new Banco();

	public Usuario buscaPeloLogin(String login) {
		return this.banco.buscaPeloNome(login);
	}
	
}
