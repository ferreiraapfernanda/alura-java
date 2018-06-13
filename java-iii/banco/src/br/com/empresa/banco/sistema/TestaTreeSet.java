package br.com.empresa.banco.sistema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class TestaTreeSet {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 1; i <= 1000; i++) {
			numeros.add(i);
			
		}
		
		Collections.reverse(numeros);
		
		for(Integer i : numeros) {
			System.out.println(i);
		}
		
	}

}
