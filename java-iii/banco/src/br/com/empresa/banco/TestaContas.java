package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SaldoInsuficienteException;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaContas {

	public static void main(String[] args) throws ValorInvalidoException {
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
