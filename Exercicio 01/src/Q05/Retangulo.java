package Q05;

public class Retangulo extends Quadrilatero{
	private double base, altura;
	
	public Retangulo(double base, double altura) {
		super(base, base, altura, altura);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.base * this.altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
