
public class Fatorial {

	public static void main(String[] args) {
		
		for(int n = 0; n <= 10; n++) {
			
			int fatorial = 1;
			
			for(int iteracao = 1; iteracao <= n; iteracao++) {
				fatorial = iteracao * fatorial; 
			}
			
			System.out.println("Fatorial de " + n + " é " + fatorial);
			
		}
	}
}
