package br.com.empresa.banco.conta;

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}
}
