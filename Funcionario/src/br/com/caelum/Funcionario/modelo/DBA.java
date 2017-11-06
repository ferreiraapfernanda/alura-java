package br.com.caelum.Funcionario.modelo;
public class DBA extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 0.1;
	}

}
