package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US); // Para interpretar . como separador decimal

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", tipoConta, agencia, numero, titular, saldo);
			
			System.out.println(valorFormatado);

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}

		scanner.close();
	}
}
