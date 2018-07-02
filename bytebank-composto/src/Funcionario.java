
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum, 1 - Gerente, 2 - Diretor

	public double getBonificacao() {
		if (this.tipo == 0) { // Funcionario comum
			return this.salario * 0.1;
		} else if (this.tipo == 1) { // Gerente
			return this.salario;
		} else {
			return this.salario + 1000.0;
		}
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}

		return false;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
