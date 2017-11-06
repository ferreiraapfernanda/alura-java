package br.com.empresa.banco.conta;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();

	}

	public double getTotal() {
		return total;
	}
	
	
	

}
