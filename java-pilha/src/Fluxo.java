
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			// Conta conta = null;
			// conta.deposita();
		}
		System.out.println("Fim do metodo2");
	}
}
