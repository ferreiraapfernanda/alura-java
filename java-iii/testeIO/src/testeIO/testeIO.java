package testeIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class testeIO {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in); //new Scanner(new FileInputStream("arquivo.txt"));
		PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));

		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		} // Ctrl+Z para fechar o stream 

		entrada.close();
		saida.close();

	}

}
