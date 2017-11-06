package br.com.caelum.Funcionario.modelo;
public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;
	
	void registra(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionario: " + f);
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}
	
	
}
