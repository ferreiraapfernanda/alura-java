package br.com.bytebank.banco.modelo;

public class GuardadorDeObjects {

	private Object[] objects;
	private int ultimaPosicao;
	
	public GuardadorDeObjects(int qtd) {
		this.objects = new Object[qtd];
		this.ultimaPosicao = 0;
	}
	
	public void adiciona(Object obj) {
		this.objects[this.ultimaPosicao] = obj;
		this.ultimaPosicao++;
	}
	
	public int getQuantidade() {
		return this.ultimaPosicao;
	}
	
	public Object getObject(int i) {
		return this.objects[i];
	}
	
	
}
