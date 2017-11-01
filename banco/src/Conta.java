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

	public void saca(double valor) throws Exception {

		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException(saldo);
		}
	}

	public abstract void atualiza(double taxa);
}
