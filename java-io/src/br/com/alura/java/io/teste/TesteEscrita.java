package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de SAIDA com arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt"); // Só escreve em bytes
		Writer osw = new OutputStreamWriter(fos); // Transforma os bytes em caracteres
		BufferedWriter bw = new BufferedWriter(osw); // Para escrever uma linha inteira, não caracteres isolados

		bw.write("Alura Java parte 7 aula 02");
		bw.newLine();
		bw.write("Fim do texto :)");
		
		bw.close(); // Já fecha o inputstream e o file stream

	}
}
