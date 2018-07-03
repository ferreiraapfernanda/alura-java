
public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(123, 321);
		conta.deposita(200);

		try {
			conta.saca(210);
		} catch (SacaException e) {
			System.out.println("Ex: " + e.getMessage());
		}

		System.out.println(conta.getSaldo());
	}
}
