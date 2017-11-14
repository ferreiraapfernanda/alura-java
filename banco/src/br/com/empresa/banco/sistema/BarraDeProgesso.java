package br.com.empresa.banco.sistema;

public class BarraDeProgesso implements Runnable {

	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.println("barra de progresso");
		}
	}
}
