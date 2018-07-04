package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();

		nico.setNome("Nico Seppat");
		nico.setCpf("22222");
		nico.setSalario(2600.0);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

		Funcionario f1 = new EditorVideo();

		f1.setNome("Funcionario um");
		f1.setSalario(3000.0);

		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
	}

}
