package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	private Banco banco = new Banco();

	public Usuario buscaPeloLogin(String login) {
		return this.banco.buscaPeloNome(login);
	}
	
}
