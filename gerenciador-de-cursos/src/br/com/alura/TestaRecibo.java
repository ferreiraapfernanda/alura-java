package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

	
		public static void main(String[] args) {
			Recibo rec1 = new Recibo();
			Recibo rec2 = new Recibo();
			Recibo rec3 = new Recibo();
			
			Set<Recibo> recibos = new TreeSet<>();
			
			recibos.add(rec1);
			recibos.add(rec2);
			recibos.add(rec3);
		}
	
}
