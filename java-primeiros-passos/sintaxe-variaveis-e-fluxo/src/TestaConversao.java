
public class TestaConversao {
	
	public static void main(String args[]) {
		double salario = 1270.5;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 535813515l;
		System.out.println(numeroGrande);
		
		short valorPequeno = 31231;
		System.out.println(valorPequeno);

		byte b = 127;
		System.out.println(b);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total); 
		// Vai aparecer como 0.30000000000000004
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}

}
