package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write("Alura Java parte 7 aula 02");
//		fw.write(System.lineSeparator()); // Usar \n ou \r\n nem sempre é a melhor prática, pois pode variar entre
//											// outros sistemas operacionais
//		fw.write("Fim do texto :)");
//
//		fw.close(); // Já fecha o inputstream e o file stream

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		bw.write("Alura Java parte 7 aula 02 - teste novo!");
		bw.newLine();
		bw.write("Fim do texto :)");

		bw.close(); // Já fecha o inputstream e o file stream

	}
}
