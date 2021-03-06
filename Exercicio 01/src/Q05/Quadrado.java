package Q05;

public class Quadrado extends Quadrilatero{
	
	private double lado;
	
	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
