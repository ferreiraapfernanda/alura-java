package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Alura Java parte 7 aula 02 - teste novo 3!");
		ps.println();
		ps.println("fi do teste");

		ps.close();
		
		PrintWriter pw = new PrintWriter("lorem3.txt", "UTF-8");
		pw.write("Novo teste com print writer");
		pw.write(System.lineSeparator());
		pw.write("fim do teste");
		pw.close();

	}
}
