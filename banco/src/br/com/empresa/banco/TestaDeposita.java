package br.com.empresa.banco;
import br.com.caelum.Funcionario.excecao.ValorInvalidoException;
import br.com.caelum.Funcionario.modelo.Conta;
import br.com.caelum.Funcionario.modelo.ContaCorrente;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();

		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
