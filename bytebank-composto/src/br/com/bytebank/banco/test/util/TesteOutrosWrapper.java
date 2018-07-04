package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//Autoboxing
		System.out.println(idadeRef.doubleValue());//Unboxing
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE; //Já possui um
		System.out.println(bRef.booleanValue());
		
		Number numero = Float.valueOf(29.5f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(1);
		lista.add(29.5f);
		listta.add(30.5);
		
		
	}
}
