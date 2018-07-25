package br.com.casadocodigo.loja.infra;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeraSenha {
	
	public static void main(String[] args) {
		
		String senhaCriptografado = new BCryptPasswordEncoder().encode("123456");
		System.out.println(senhaCriptografado);
	}

}
