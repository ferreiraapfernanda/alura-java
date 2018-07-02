public class CriaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 200;
		conta1.saldo += 100;

		Conta conta2 = new Conta();
		conta2.saldo = 50;

		System.out.println("Saldo da conta 1 é R$" + conta1.saldo);
		System.out.println("Saldo da conta 2 é R$" + conta2.saldo);

		System.out.println(conta1.agencia);
		System.out.println(conta1.numero);

		System.out.println(conta2.agencia);

		conta2.agencia = 146;
		System.out.println("Agora a conta 2 está na agência " + conta2.agencia);
	}
}
