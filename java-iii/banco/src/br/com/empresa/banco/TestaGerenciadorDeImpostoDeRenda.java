package br.com.empresa.banco;


public class TestaGerenciadorDeImpostoDeRenda {
	
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.printf("O saldo é: %.2f", gerenciador.getTotal());
	}

}
