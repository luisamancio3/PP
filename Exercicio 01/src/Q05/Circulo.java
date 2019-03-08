package Q05;

public class Circulo implements FormaGeometrica{
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}