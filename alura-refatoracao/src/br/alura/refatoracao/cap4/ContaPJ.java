package br.alura.refatoracao.cap4;

public class ContaPJ extends ContaBancaria {

	private String titular;
	private double saldo;

	public ContaPJ(String titular, double saldoInicial) {
		super(saldoInicial, titular);
	}
	
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}
	
	public void deposita(double valor) {
		super.saca(valor - 0.2);
	}
	
}
