abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	private int senha;
	
	abstract double getBonificacao();

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
}
