package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // Só lê em bytes
		Reader isr = new InputStreamReader(fis); // Transforma os bytes em caracteres
		BufferedReader br = new BufferedReader(isr); // Para ler uma linha inteira, não caracteres isolados

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close(); // Já fecha o inputstream e o file stream

	}
}
