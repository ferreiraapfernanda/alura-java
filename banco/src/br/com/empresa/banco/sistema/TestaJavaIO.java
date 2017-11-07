package br.com.empresa.banco.sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaJavaIO {

	public static void main(String[] args) throws IOException {
		/*InputStream is = System.in; //new FileInputStream("LEITURA.TXT");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		while (linha != null) {
			bw.append(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();
		*/
		
		Scanner scanner = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream print = new PrintStream("saida.txt");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			print.println(linha);			
		}
		
		scanner.close();
		print.close();

	}

}
