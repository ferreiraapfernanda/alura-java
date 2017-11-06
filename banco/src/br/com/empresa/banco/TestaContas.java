package br.com.empresa.banco;
import br.com.caelum.Funcionario.excecao.SaldoInsuficienteException;
import br.com.caelum.Funcionario.modelo.Conta;
import br.com.caelum.Funcionario.modelo.ContaCorrente;

public class TestaContas {

	public static void main(String[] args) {
		Conta joao = new ContaCorrente();
		joao.deposita(50.0);

		try {
			joao.saca(100);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		}
		catch (Exception e) {
			System.out.println("Um outro erro qualquer!");
		}

		System.out.println(joao.getSaldo());
	}
}
