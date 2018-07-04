package br.com.bytebank.banco.modelo;

/**
 * Classe abstrata Conta
 * 
 * Representa uma conta no banco
 * 
 * @author fernanda
 *
 */
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // é o mesma referência para objetos diferentes

	/**
	 * Construtor para inicializar o objeto Conta a partir de agência e número
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;

		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Método abstrato deposita
	 * 
	 * @param valor a ser adicionado
	 */
	public abstract void deposita(double valor);

	/**
	 * Método saca
	 * 
	 * Retira um valor do saldo. Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SacaException
	 */
	public void saca(double valor) throws SacaException{

		if (this.saldo < valor) {
			throw new SacaException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;

	}

	/**
	 * Método transfere
	 * 
	 * Faz a transferência de um valor do saldo para outra conta
	 * 
	 * @param valor   a ser transferido
	 * @param destino conta destino
	 * @return status da transferência
	 */
	public void transfere(double valor, Conta destino) throws SacaException{
		this.saca(valor);
		destino.deposita(valor);
	}

	/**
	 * Método getSaldo
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Método getNumero()
	 * 
	 * @return numero
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Método setNumero()
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	/**
	 * Método getAgencia()
	 * 
	 * @return
	 */
	public int getAgencia() {
		return this.agencia;
	}

	/**
	 * Método setAgencia()
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		if (agencia < 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	/**
	 * Método setTitular
	 * 
	 * @param titular
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/**
	 * Método getTitular
	 * 
	 * @return
	 */
	public Cliente getTitular() {
		return this.titular;
	}

	/**
	 * Método getTotal
	 * 
	 * @return
	 */
	public static int getTotal() {
		return Conta.total;
	}

}
