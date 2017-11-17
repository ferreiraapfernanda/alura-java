package br.alura.refatoracao.cap4;

public class ContaPF extends ContaBancaria {

	private String titular;
	private double saldo;

	public ContaPF(String titular, double saldoInicial) {
		super(saldoInicial, titular);
	}
	
	public void saca(double valor) {
		super.saca(valor + 0.1);
	}
	
	public void deposita(double valor) {
		super.saca(valor - 0.1);
	}
	
}
