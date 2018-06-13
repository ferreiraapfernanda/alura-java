package br.alura.refatoracao.cap3;

public class NotaFiscal {

	private int id;
	private double valorBruto;

	public NotaFiscal(int id, double valorBruto) {
		this.id = id;
		this.valorBruto = valorBruto;
	}

	public NotaFiscal(double valorBruto) {
		this(0, valorBruto);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public double getImpostos() {
		
		double imposto = 0;
		
		if(valorBruto < 200) {
			imposto = valorBruto * 0.03;
		}
		else if(valorBruto > 200 && valorBruto <= 1000) {
			imposto = valorBruto * 0.06;
		}
		else {
			imposto = valorBruto * 0.07;
		}
		
		return imposto;
		
	}
	public double getValorLiquido() {
		return this.valorBruto - this.getImpostos();
	}

}