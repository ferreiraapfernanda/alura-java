package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {
	
	protected double saldo;
	protected String titular;
	
	public ContaBancaria(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	public void saca( double valor) {
		this.saldo -= valor;
	}
	
	public void deposita( double valor) {
		this.saldo += valor;
	}

}
