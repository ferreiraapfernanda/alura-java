package br.com.empresa.banco.conta;
public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }
    	
    @Override
    public int compareTo(Conta outra) {
    	return this.getNome().compareTo(outra.getNome());    	
    }
   
}
