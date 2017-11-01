
class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}

	public double getBonificacao() {
		return this.salario * 0.3;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha != senha ) {
			return false;
		}
		
		return true;
	}
}
