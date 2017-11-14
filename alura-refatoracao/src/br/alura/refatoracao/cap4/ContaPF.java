package br.alura.refatoracao.cap4;

public class ContaPF {

	private String titular;
	private double saldo;

	public ContaPF(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public void saca(double valor) {
		saldo -= valor + 0.1;
	}
	
	public void deposita(double valor) {
		saldo += valor - 0.1;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
