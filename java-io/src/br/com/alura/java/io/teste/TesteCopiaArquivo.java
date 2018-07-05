package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		//InputStream fr = new FileInputStream("lorem.txt");
		//InputStream fr = System.in;
		InputStream fr = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(fr);
		BufferedReader br = new BufferedReader(isr);

		//OutputStream os = new FileOutputStream("newfile.txt");
		//OutputStream os = System.out;
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			
			linha = br.readLine();
		}

		bw.close();
		br.close();

	}
}
