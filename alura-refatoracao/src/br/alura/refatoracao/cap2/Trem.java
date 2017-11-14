package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean disp(int reservas) {
		
		int r = 0;
		for(Vagao v : vagoes) {
			r += v.reservados();
		}
		
		r = capacidade - r;
		return r > reservas; 
	}
	
}