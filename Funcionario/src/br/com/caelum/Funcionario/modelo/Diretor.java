package br.com.caelum.Funcionario.modelo;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	double getBonificacao() {
		return this.salario * 0.35;
	}
	
	public void cobraRelatorios() {
		System.out.println("Preciso dos relatórios.");
	}
	
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return super.autentica(senha);
	}

}
