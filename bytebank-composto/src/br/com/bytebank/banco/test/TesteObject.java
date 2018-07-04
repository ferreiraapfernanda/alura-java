package br.com.bytebank.banco.test;

public class TesteObject {

	public static void main(String[] args) {

		int[] idades = new int[5];
//		idades[0] = 19;
//		idades[1] = 29;
//		idades[2] = 39;
//		idades[3] = 49;
//		idades[4] = 59;
		
		int[] idadesLiteral = {19,29,39,49,59};
				
		for (int i : idades) {
			System.out.println(i);
		}
		
	}
}
