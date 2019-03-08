package Q05;

public abstract class Quadrilatero implements FormaGeometrica{
	private double lado1, lado2, lado3, lado4;

	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	@Override
	public double perimetro() {
		return this.lado1 + this.lado2 + this.lado3 + this.lado4;
	}
	
}
