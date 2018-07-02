public class TesteReferencias {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 300;
		
		// A conta2 será uma referência pro mesmo objeto
		Conta conta2 = conta1;
		conta2.saldo += 100;
		
		System.out.println("Saldo da conta 1 é " + conta1.saldo);
		System.out.println("Saldo da conta 2 é " + conta2.saldo);
		
		if(conta1 == conta2) {
			System.out.println("São a mesma conta!");
		}
		
		System.out.println(conta1);
		System.out.println(conta2);
	}
	
}
