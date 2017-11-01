class Desenvolvedor extends Funcionario{

	@Override
	double getBonificacao() {
		return this.salario * 0.25;
	}

}
