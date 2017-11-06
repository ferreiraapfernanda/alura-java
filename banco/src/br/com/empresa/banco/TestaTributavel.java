package br.com.empresa.banco;
import br.com.caelum.Funcionario.modelo.ContaCorrente;
import br.com.caelum.Funcionario.modelo.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
	}

}
