package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Rodrigo Turini");
		System.out.println(pauloEstaMatriculado);

		for (String aluno : alunos) {
			//System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
