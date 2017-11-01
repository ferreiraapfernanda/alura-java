package interfaces;

public class Circulo implements AreaCalculavel{

	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return 2 * Math.PI * this.raio;
	}

}
