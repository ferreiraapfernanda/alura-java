package br.alura.refatoracao.cap6;

public enum Moeda {

	DOLAR(2.7),
	EURO(3.0);
	
	private double taxa;
	
	Moeda(double taxa){
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}
	
	
}
