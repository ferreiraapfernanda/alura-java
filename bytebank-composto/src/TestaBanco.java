
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome(
"Paulo Silveira");
		paulo.setCpf(
"222.222.222-22");
		paulo.setProfissao("Programador");
		
		Conta contaDoPaulo = new ContaCorrente
				(1010,2020);
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.setTitular(
paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
	}
}
