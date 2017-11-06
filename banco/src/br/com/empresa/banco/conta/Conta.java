package br.com.empresa.banco.conta;

public abstract class Conta {

	protected double saldo;
	private int numero;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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
	
	@Override
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(! (obj instanceof Conta)) {
			return false;
		}
		
		Conta outra = (Conta) obj;
		
		return outra.nome.equals(this.nome) && outra.numero == this.numero;
		
	}
	
	
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
