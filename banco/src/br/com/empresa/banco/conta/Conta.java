package br.com.empresa.banco.conta;

public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.10;
		}

	}

	/**
	 * Realiza um saque na conta, dado o valor passado
	 * @param valor valor a ser sacado
	 * @throws Exception caso o saldo seja insuficiente
	 */
	public void saca(double valor) throws Exception {

		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}

	public abstract void atualiza(double taxa);
}
