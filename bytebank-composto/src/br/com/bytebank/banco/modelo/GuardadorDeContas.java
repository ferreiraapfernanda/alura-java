package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta c) {
		this.referencias[this.posicaoLivre] = c;
		this.posicaoLivre++;
	}

	public void mostra() {
		
		for (Conta conta : referencias) {
			System.out.println(conta);
		}
		
	}

	public int getQuantidadeDeElementos() {
		return posicaoLivre;
	}

	public Conta getConta(int i) {
		return this.referencias[i];
	}
}
