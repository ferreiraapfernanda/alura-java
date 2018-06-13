package br.com.empresa.banco.sistema;

public class TesteLetraPorLetra {

	public void letraPorLetra(String texto) {

		for (int x = texto.length() - 1; x >= 0; x--) {
			System.out.print(texto.charAt(x));
		}

	}

	public void ordemInvertida(String texto) {

		StringBuilder buffer = new StringBuilder(texto);
		System.out.println(buffer.reverse());

	}

	public static void main(String[] args) {
		TesteLetraPorLetra texto = new TesteLetraPorLetra();
		// texto.ordemInvertida("Socorram-me, subi no ônibus em Marrocos");

		int numero = toNumber("190");
		System.out.println(numero);
	}

	public static int toNumber(String numero) {
		int resultado = 0;
		while (numero.length() > 0) {
			char algarismo = numero.charAt(0);
			resultado = resultado * 10 + (algarismo - '0');
			numero = numero.substring(1);
		}
		return resultado;
	}

}
