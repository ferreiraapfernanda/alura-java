package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario";
		String outro = new String("ALura");
		
		String novo = nome.replace("A", "a");
		
		novo = nome.toLowerCase();
		novo = nome.toUpperCase();
		
		System.out.println(novo);
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		System.out.println(System.out.getClass());
	}
}
